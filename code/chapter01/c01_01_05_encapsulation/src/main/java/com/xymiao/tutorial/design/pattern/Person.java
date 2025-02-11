package com.xymiao.tutorial.design.pattern;

public class Person {

    private String name;
    private int age;

    // Getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("姓名不能为空");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150) {
            throw new IllegalArgumentException("年龄不合法");
        }
        this.age = age;
    }
}
