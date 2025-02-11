package com.bjpowernode.api.service;

import com.bjpowernode.api.model.ProductInfo;
import com.bjpowernode.api.pojo.MultiProduct;

import java.util.List;

/**
 * Package:com.bjpowernode.api.service
 * Date:2022/3/3 14:35
 * 产品接口
 */
public interface ProductService {
    /*根据产品类型，查询产品，支持分页*/
    List<ProductInfo> queryByTypeLimit(Integer pType,Integer pageNo,Integer pageSize);

    /*某个产品类型的记录总数*/
    Integer queryRecordNumsByType(Integer pType);

    /*首页的多个产品数据*/
    MultiProduct queryIndexPageProducts();

    /** 根据产品id ，查询产品信息 */
    ProductInfo queryById(Integer id);


}
