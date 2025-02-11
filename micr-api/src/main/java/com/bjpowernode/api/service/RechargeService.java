package com.bjpowernode.api.service;

import com.bjpowernode.api.model.RechargeRecord;

import java.util.List;

/**
 * Package:com.bjpowernode.api.service
 * Date:2022/3/14 9:06
 */
public interface RechargeService {

    /*根据userID查询它的充值记录*/
    List<RechargeRecord> queryByUid(Integer uid,Integer pageNo, Integer pageSize);

    int addRechargeRecord(RechargeRecord record);

    /*处理后续充值*/
    int handleKQNotify(String orderId, String payAmount, String payResult);
}
