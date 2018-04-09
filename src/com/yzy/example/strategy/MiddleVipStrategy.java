package com.yzy.example.strategy;

/**
 * 初级会员
 */
public class MiddleVipStrategy implements VipStrategy {
    @Override
    public double calculatePrivce(double basePrice) {
        System.out.println("中级会员9折");
        return basePrice*0.9;
    }
}
