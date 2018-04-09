package com.yzy.example.responsibility;

/**
 * 这个1级管理者可以理解为主管
 */
public class Manager1 extends Manager {

    public Manager1(String name){
        this.setName(name);
    }


    @Override
    public void leave(int day) {
        if (day <= 3) {
            System.out.println(getName()+"处理了");
        } else if (superior != null) {
            superior.leave(day);
        }
    }

    @Override
    public void raises(int level) {
        // TODO: 18-4-9
    }
}
