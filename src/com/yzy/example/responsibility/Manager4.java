package com.yzy.example.responsibility;

/**
 * 这个4级管理者可以理解为boss
 */
public class Manager4 extends Manager {
    @Override
    public void manage(int type) {
        if (type <= 30) {
            System.out.println("manager4处理了");
        } else if (mLeader != null) {
            mLeader.manage(type);
        }
    }
}
