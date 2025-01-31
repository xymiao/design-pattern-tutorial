package com.xymiao.tutorial.design.pattern.factory01;

public class LongDataType implements DataTypeBase{
    @Override
    public Result getJavaTypeInfo() {
        return getInfo(Long.class);
    }
}
