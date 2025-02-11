package com.xymiao.tutorial.design.pattern;

public class UnionPayFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new UnionPay();
    }
}