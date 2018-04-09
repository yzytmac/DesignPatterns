package com.yzy.example.responsibility;

/**
 * 这个4级管理者可以理解为boss
 */
public class Manager4 extends Manager {
    public Manager4(String name){
        this.setName(name);
    }
    @Override
    public void manage(int type) {
        if (type <= 30) {
            System.out.println(getName()+"处理了");
        } else if (superior != null) {
            superior.manage(type);
        }
    }
}
