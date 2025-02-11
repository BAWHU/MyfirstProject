package com.bjpowernode.common.constants;

/**
 * Package:com.bjpowernode.common.constants
 * Date:2022/3/4 9:24
 */
public class RedisKey {

    /*投资排行榜*/
    public static  final String KEY_INVEST_RANK = "INVEST:RANK";

    /*注册时，短信验证码 SMS:REG:手机号*/
    public static final String KEY_SMS_CODE_REG = "SMS:REG:";
    /*登录时，短信验证码 SMS:LOGIN:手机号*/
    public static final String KEY_SMS_CODE_LOGIN = "SMS:LOGIN:";

    /*redis自增*/
    public static final String KEY_RECHARGE_ORDERID = "RECHARGE:ORDERID:SEQ";

    /*orderId*/
    public static final String KEY_ORDERID_SET= "RECHARGE:ORDERID:SET";
}
