package com.xymiao.tutorial.design.pattern;

// 客户端代码
public class Client extends SimpleFactory {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.use();  // 输出: Using Product A

        Product productB = SimpleFactory.createProduct("B");
        productB.use();  // 输出: Using Product B
    }
}