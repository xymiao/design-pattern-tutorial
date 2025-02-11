package com.xymiao.tutorial.design.pattern;

/**
 * 具体产品类A
 */
class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("使用具体的产品 B, Using Product B");
    }
}