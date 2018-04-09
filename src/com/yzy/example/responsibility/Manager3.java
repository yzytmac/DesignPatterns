package com.yzy.example.responsibility;

/**
 * 这个3级管理者可以理解为总监
 */
public class Manager3 extends Manager {
    @Override
    public void manage(int type) {
        if (type <= 7) {
            System.out.println("manager3处理了");
        } else if (mLeader != null) {
            mLeader.manage(type);
        }
    }
}
