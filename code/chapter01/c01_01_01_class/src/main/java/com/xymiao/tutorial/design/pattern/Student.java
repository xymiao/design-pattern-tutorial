package com.xymiao.tutorial.design.pattern;

public class Student {
    // 成员变量
    private String name;
    private int age;

    // 构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法
    public void introduce() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }

    public static void main(String[] args) {
        Student s1 = new Student("张三", 20);
        s1.introduce(); // 输出：我叫张三, 今年20岁
    }
}
