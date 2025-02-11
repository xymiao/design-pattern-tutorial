package com.xymiao.tutorial.design.pattern;

public class WechatPay implements Payment{
    @Override
    public void pay() {
        System.out.println("Wechat Pay");
    }
}
