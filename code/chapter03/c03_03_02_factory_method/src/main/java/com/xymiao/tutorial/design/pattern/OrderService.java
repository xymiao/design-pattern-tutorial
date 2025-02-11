package com.xymiao.tutorial.design.pattern;

public class OrderService {
    private PaymentFactory paymentFactory;

    public void setPaymentFactory(String payType) {
        switch (payType.toLowerCase()) {
            case "alipay":
                this.paymentFactory = new AliPayFactory();
                break;
            case "wechat":
                this.paymentFactory = new WechatPayFactory();
                break;
            case "union":
                this.paymentFactory = new UnionPayFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown payment type: " + payType);
        }
    }

    public void pay(String payType) {
        setPaymentFactory(payType);
        Payment payment = paymentFactory.createPayment();
        payment.pay();
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.pay("alipay");
        orderService.pay("wechat");
        orderService.pay("union");
    }
}
