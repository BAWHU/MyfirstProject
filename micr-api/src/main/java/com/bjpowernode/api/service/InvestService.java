package com.bjpowernode.api.service;

import com.bjpowernode.api.pojo.BidInfoProduct;

import java.math.BigDecimal;
import java.util.List;

/**
 * Package:com.bjpowernode.api.service
 * Date:2022/3/8 10:59
 */
public interface InvestService {

    /** 查询某个产品的投资记录 */
    List<BidInfoProduct> queryBidListByProductId(Integer productId,
                                                 Integer pageNo,
                                                 Integer pageSize);

    /*投资理财产品， int 是投资的结果 ， 1 投资成功*/
    int investProduct(Integer uid, Integer productId, BigDecimal money);
}
