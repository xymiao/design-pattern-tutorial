package com.xymiao.tutorial.design.pattern.factory01;

public class DataTypeFactory {
    DataTypeBase build(String dbTypeName) {
        DataTypeBase dataTypeBase = null;
        dbTypeName = dbTypeName.toLowerCase();

        switch (dbTypeName) {
            case "int":
            case "tinyint":
                dataTypeBase = new IntegerDataType();
                break;
            case "varchar":
            case "char":
            case "text":
                dataTypeBase = new StringDataType();
                break;
            case "bigint":
                dataTypeBase = new LongDataType();
                break;
            case "date":
            case "datetime":
                dataTypeBase = new LocalDateTimeDataType();
                break;
            default:
                throw new RuntimeException("错误类型");
        }
        return dataTypeBase;
    }
}
