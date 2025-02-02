package com.xymiao.tutorial.design.pattern;

public class AppDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle()};
        for(Shape a : shapes) {
            a.calculateArea(); // 多态表现
        }
    }
}
