package com.yzy.example.strategy;

/**
 * 初级会员
 */
public class HighVipStrategy implements VipStrategy {
    @Override
    public double calculatePrivce(double basePrice) {
        System.out.println("高级会员8折");
        return basePrice*0.8;
    }
}
