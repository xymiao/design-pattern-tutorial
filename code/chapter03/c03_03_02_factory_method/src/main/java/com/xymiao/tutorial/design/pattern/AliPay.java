package com.xymiao.tutorial.design.pattern;

public class AliPay implements Payment{
    @Override
    public void pay() {
        System.out.println("Ali Pay");
    }
}
