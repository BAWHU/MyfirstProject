package com.bjpowernode;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Package:com.bjpowernode
 * Date:2022/3/11 9:49
 */
public class JwtTest {

    //创建jwt
    //342903934cb944808920b642616b3e76
    @Test
    public void testCreateJwt() {
        String key = "342903934cb944808920b642616b3e76";

        //创建SeceretKey
        SecretKey secretKey = Keys.hmacShaKeyFor(key.getBytes(StandardCharsets.UTF_8));

        Date curDate = new Date();
        Map<String,Object> data = new HashMap<>();
        data.put("userId",1001);
        data.put("name","李四");
        data.put("role","经理");
        //创建Jwt，使用Jwts类
        String jwt = Jwts.builder().signWith(secretKey, SignatureAlgorithm.HS256)
                .setExpiration(DateUtils.addMinutes(curDate, 10))
                .setIssuedAt(curDate)
                .setId(UUID.randomUUID().toString())
                .addClaims(data).compact();

        //eyJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2NDY5NjQzNjMsImlhdCI6MTY0Njk2Mzc2MywianRpIjoiMjdiMGEyYjgtY2E4Yy00ZGM2LWE3OWItNDdkMGZjNTgwYmJlIiwicm9sZSI6Iue7j-eQhiIsIm5hbWUiOiLmnY7lm5siLCJ1c2VySWQiOjEwMDF9.csFmqoYHl_jylijp5dlWHdzRB0Uce5c71ZtgVv77Id0
        System.out.println("jwt=="+jwt);


    }

    @Test
    public void testReadJwt(){
        String jwt="eyJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2NDY5NjY3NzYsImlhdCI6MTY0Njk2NjE3NiwianRpIjoiOWJmNWQwNGMtODY4MS00ZWU0LWFiMjItYmExNTg1YzFhZGMwIiwicm9sZSI6Iue7j-eQhiIsIm5hbWUiOiLmnY7lm5siLCJ1c2VySWQiOjEwMDF9._A3p4rsqdbl8Mxu631axXNEjcMP72c8xVv7GXtmLg1o";
        String key = "342903934cb944808920b642616b3e76";
        //创建SeceretKey
        SecretKey secretKey = Keys.hmacShaKeyFor(key.getBytes(StandardCharsets.UTF_8));

        //解析jwt ， 没有异常，解析成功
        Jws<Claims> claims = Jwts.parserBuilder().setSigningKey(secretKey).build()
                              .parseClaimsJws(jwt);

        //读数据
        Claims body = claims.getBody();
        Integer userId = body.get("userId", Integer.class);
        System.out.println("userId="+userId);
        Object uid = body.get("userId");
        System.out.println("uid="+uid);

        Object name = body.get("name");
        if( name != null ){
            String str= (String)name;
            System.out.println("str = " + str);
        }

        String jwtId = body.getId();
        System.out.println("jwtId="+jwtId);

        Date expiration = body.getExpiration();
        System.out.println("过期时间："+expiration);


    }
}
