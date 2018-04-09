package com.yzy.example.responsibility;

/**
 * 抽象出具有管理能力的类
 */
public abstract class Manager {
    protected Manager mLeader;//领导
    public void setLeader(Manager pLeader){
        this.mLeader = pLeader;
    }

    public abstract void manage(int type);
}
