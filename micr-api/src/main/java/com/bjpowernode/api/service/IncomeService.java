package com.bjpowernode.api.service;

/**
 * Package:com.bjpowernode.api.service
 * Date:2022/3/15 11:03
 * 收益（利息）
 */
public interface IncomeService {
    /*收益计划*/
    void generateIncomePlan();

    /*收益返还*/
    void generateIncomeBack();
}

