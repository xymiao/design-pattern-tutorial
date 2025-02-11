package com.xymiao.tutorial.design.pattern;

/**
 * Simple Factory Pattern 简单工厂模式
 */
class SimpleFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }
        throw new IllegalArgumentException("Unknown product type");
    }
}