package com.yzy.example.responsibility;

/**
 * 这个3级管理者可以理解为总监
 */
public class Manager3 extends Manager {

    public Manager3(String name){
        this.setName(name);
    }
    @Override
    public void manage(int type) {
        if (type <= 7) {
            System.out.println(getName()+"处理了");
        } else if (superior != null) {
            superior.manage(type);
        }
    }
}
