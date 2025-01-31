package com.xymiao.tutorial.design.pattern.factory01;

public class StringDataType implements DataTypeBase{
    @Override
    public Result getJavaTypeInfo() {
        return getInfo(String.class);
    }
}
