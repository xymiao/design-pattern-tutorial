package com.xymiao.tutorial.design.pattern;

public class AppDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};
        for(Animal a : animals) {
            a.sound(); // 多态表现
        }
    }
}
