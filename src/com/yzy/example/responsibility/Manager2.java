package com.yzy.example.responsibility;

/**
 * 这个2级管理者可以理解为经理
 */
public class Manager2 extends Manager {

    public Manager2(String name){
        this.setName(name);
    }
    @Override
    public void manage(int type) {
        if (type <= 5) {
            System.out.println(getName()+"处理了");
        } else if (superior != null) {
            superior.manage(type);
        }
    }
}
