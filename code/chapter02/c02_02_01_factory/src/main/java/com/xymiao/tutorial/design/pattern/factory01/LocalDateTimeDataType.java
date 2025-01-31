package com.xymiao.tutorial.design.pattern.factory01;

import java.time.LocalDateTime;

public class LocalDateTimeDataType implements DataTypeBase{

    @Override
    public Result getJavaTypeInfo() {
        return getInfo(LocalDateTime.class);
    }
}
