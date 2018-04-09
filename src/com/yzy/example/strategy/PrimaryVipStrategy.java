package com.yzy.example.strategy;

/**
 * 初级会员
 */
public class PrimaryVipStrategy implements VipStrategy {
    @Override
    public double calculatePrivce(double basePrice) {
        System.out.println("初级会员没有折扣");
        return basePrice;
    }
}
