package com.xymiao.tutorial.design.pattern;

public class UnionPay implements Payment{
    @Override
    public void pay() {
        System.out.println("Union Pay");
    }
}
