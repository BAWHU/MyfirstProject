package com.bjpowernode.api.pojo;

import com.bjpowernode.api.model.User;

import java.math.BigDecimal;

/**
 * Package:com.bjpowernode.api.pojo
 * Date:2022/3/12 12:09
 */
public class UserAccountInfo extends User {
    private BigDecimal availableMoney;

    public BigDecimal getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(BigDecimal availableMoney) {
        this.availableMoney = availableMoney;
    }
}
