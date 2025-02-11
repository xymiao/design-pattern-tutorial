package com.xymiao.tutorial.design.pattern;

public class AliPayFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new AliPay();
    }
}