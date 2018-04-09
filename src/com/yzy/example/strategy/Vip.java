package com.yzy.example.strategy;

public class Vip {
    private VipStrategy mStrategy;
    public Vip(VipStrategy pVipStrategy){
        mStrategy = pVipStrategy;
    }

    public double calculatePrivce(double basePrice){
        return mStrategy.calculatePrivce(basePrice);
    }
}
