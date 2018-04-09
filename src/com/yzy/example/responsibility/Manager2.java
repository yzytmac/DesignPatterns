package com.yzy.example.responsibility;

/**
 * 这个2级管理者可以理解为经理
 */
public class Manager2 extends Manager {
    @Override
    public void manage(int type) {
        if (type <= 5) {
            System.out.println("manager2处理了");
        } else if (mLeader != null) {
            mLeader.manage(type);
        }
    }
}
