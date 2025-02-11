package com.xymiao.tutorial.design.pattern;

public class AppDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(20);
        System.out.println(person.getName() + " " + person.getAge());
    }
}
