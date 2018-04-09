package com.yzy.example.responsibility;

/**
 * 抽象出具有管理能力的类
 */
public abstract class Manager {
    protected Manager superior;//上级
    private String name;

    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    /**
     * 请假
     * @param day
     */
    public abstract void leave(int day);

    /**
     * 加薪
     * @param level
     */
    public abstract void raises(int level);
}
