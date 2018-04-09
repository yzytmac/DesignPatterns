package com.yzy.example.strategy;

public class Main {
    public static void main(String[] args){
        //创建一个初级会员,对应的就是初级会员的折扣策略
        Vip vPrimaryVip = new Vip(new PrimaryVipStrategy());
        Vip vMiddleVip = new Vip(new MiddleVipStrategy());
        Vip vHighVip = new Vip(new HighVipStrategy());
        //原价100元后的折扣
        double vPrivce1 = vPrimaryVip.calculatePrivce(100);
        System.out.println(vPrivce1);
        double vPrivce2 = vMiddleVip.calculatePrivce(100);
        System.out.println(vPrivce2);
        double vPrivce3 = vHighVip.calculatePrivce(100);
        System.out.println(vPrivce3);

        ////////////////////////上面是单纯的策略模式,可以结合工厂模式来写////////////////////////////////

        Vip vip0 = StrategyFactory.createStrategy(0);//初级会员
        Vip vip1 = StrategyFactory.createStrategy(1);//中级
        Vip vip2 = StrategyFactory.createStrategy(2);//高级
        Vip vip3 = StrategyFactory.createStrategy(3);//又是初级

        //原价100元后的折扣
        System.out.println(vip0.calculatePrivce(100));
        System.out.println(vip1.calculatePrivce(100));
        System.out.println(vip2.calculatePrivce(100));
        System.out.println(vip3.calculatePrivce(100));


    }
}
