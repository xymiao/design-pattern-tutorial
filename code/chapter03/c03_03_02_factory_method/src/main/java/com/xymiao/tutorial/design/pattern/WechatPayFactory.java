package com.xymiao.tutorial.design.pattern;

public class WechatPayFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new WechatPay();
    }
}