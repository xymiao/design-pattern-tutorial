package com.xymiao.tutorial.design.pattern.factory01;

public class IntegerDataType implements DataTypeBase {
    @Override
    public Result getJavaTypeInfo() {
        return getInfo(Integer.class);
    }
}
