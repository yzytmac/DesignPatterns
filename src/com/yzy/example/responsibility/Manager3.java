package com.yzy.example.responsibility;

/**
 * 这个3级管理者可以理解为总监
 */
public class Manager3 extends Manager {

    public Manager3(String name){
        this.setName(name);
    }

    @Override
    public void leave(int day) {
        if (day <= 7) {
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
