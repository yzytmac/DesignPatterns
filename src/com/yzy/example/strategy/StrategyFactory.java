package com.yzy.example.strategy;

public class StrategyFactory {
    public static Vip createStrategy(int level) {
        switch (level) {
            case 0:
                return new Vip(new PrimaryVipStrategy());
            case 1:
                return new Vip(new MiddleVipStrategy());
            case 2:
                return new Vip(new HighVipStrategy());
            default:
                return new Vip(new PrimaryVipStrategy());
        }

    }


}
