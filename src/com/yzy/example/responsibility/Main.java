package com.yzy.example.responsibility;

public class Main {
    public static void main(String[] args){
        Manager1 vManager1 = new Manager1("主管");
        Manager2 vManager2 = new Manager2("经理");
        Manager3 vManager3 = new Manager3("总监");
        Manager4 vManager4 = new Manager4("老板");

        vManager1.setSuperior(vManager2);
        vManager2.setSuperior(vManager3);
        vManager3.setSuperior(vManager4);

        //请假天数
        vManager1.leave(1);
        vManager1.leave(3);
        vManager1.leave(5);
        vManager1.leave(7);
        vManager1.leave(10);
        vManager1.leave(30);
    }
}
