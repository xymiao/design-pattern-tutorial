package com.xymiao.tutorial.design.pattern.factory01;

public class DataTypeMain {
    public static void main(String[] args) {
        DataTypeFactory dataTypeFactory = new DataTypeFactory();
        DataTypeBase dataTypeBase = dataTypeFactory.build("int");
        System.out.println("dataTypeBase = " + dataTypeBase.getJavaTypeInfo());

        dataTypeBase = dataTypeFactory.build("varchar");
        System.out.println("dataTypeBase = " + dataTypeBase.getJavaTypeInfo());

        dataTypeBase = dataTypeFactory.build("datetime");
        System.out.println("dataTypeBase = " + dataTypeBase.getJavaTypeInfo());
    }
}
