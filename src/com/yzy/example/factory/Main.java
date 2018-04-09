package com.yzy.example.factory;

public class Main {
    public static void main(String[] args){
        Phone miPhone = FuShiKang.createPhone("Mi");
        Phone meiZuPhone = FuShiKang.createPhone("MeiZu");
        Phone letvPhone = FuShiKang.createPhone("Letv");
    }
}
