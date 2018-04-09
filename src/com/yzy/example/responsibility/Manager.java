package com.yzy.example.responsibility;

/**
 * 抽象出具有管理能力的类
 */
public abstract class Manager {
    protected Manager superior;//上级
    private String name;

    public void setLeader(Manager superior){
        this.superior = superior;
    }

    public abstract void manage(int type);

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }
}
