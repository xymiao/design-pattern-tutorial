package com.xymiao.tutorial.design.pattern;

/**
 * 具体产品A
 */
class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("使用具体的产品 A, Using Product A");
    }
}