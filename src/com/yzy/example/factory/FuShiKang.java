package com.yzy.example.factory;

public class FuShiKang {
    public static Phone createPhone(String name){
        switch (name){
            case "Mi":
                return new Mi();
            case "MeiZu":
                return new MeiZu();
            case "Letv":
                return new Letv();
            default: return null;
        }
    }
}
