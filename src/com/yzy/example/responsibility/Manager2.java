package com.yzy.example.responsibility;

/**
 * 这个2级管理者可以理解为经理
 */
public class Manager2 extends Manager {

    public Manager2(String name) {
        this.setName(name);
    }

    @Override
    public void leave(int day) {
        if (day <= 5) {
            System.out.println(getName() + "处理了");
        } else if (superior != null) {
            superior.leave(day);
        }

    }

    @Override
    public void raises(int level) {
// TODO: 18-4-9
    }
}
