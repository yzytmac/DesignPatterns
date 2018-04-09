package com.yzy.example.responsibility;

/**
 * 这个1级管理者可以理解为主管
 */
public class Manager1 extends Manager {
    @Override
    public void manage(int type) {
        if (type <= 3) {
            System.out.println("manager1处理了");
        } else if (mLeader != null) {
            mLeader.manage(type);
        }
    }
}
