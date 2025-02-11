package com.xymiao.tutorial.design.pattern;

public class PayClient {
    public static void main(String[] args) {
        PaymentFactory factory = new WechatPayFactory();
        Payment payment = factory.createPayment();
        payment.pay();  // 输出: WeChat Pay

        factory = new AliPayFactory();
        payment = factory.createPayment();
        payment.pay();  // 输出: Ali Pay

        factory = new UnionPayFactory();
        payment = factory.createPayment();
        payment.pay();  // 输出: Union Pay
    }
}
