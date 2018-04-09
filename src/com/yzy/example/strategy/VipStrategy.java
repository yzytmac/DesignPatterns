package com.yzy.example.strategy;

public interface VipStrategy {
    /**
     * 计算价格
     * @param basePrice 原价
     * @return
     */
    double calculatePrivce(double basePrice);
}
