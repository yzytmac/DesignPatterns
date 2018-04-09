package com.yzy.example.responsibility;

/**
 * 这个1级管理者可以理解为主管
 */
public class Manager1 extends Manager {

    public Manager1(String name){
        this.setName(name);
    }

    @Override
    public void manage(int type) {
        if (type <= 3) {
            System.out.println(getName()+"处理了");
        } else if (superior != null) {
            superior.manage(type);
        }
    }
}
