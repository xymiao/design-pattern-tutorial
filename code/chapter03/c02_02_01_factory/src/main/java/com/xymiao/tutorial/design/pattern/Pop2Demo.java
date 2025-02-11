package com.xymiao.tutorial.design.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 获得数据库中字段类型的 Java 数据类型
 */
public class Pop2Demo {
    public static void main(String[] args) {
        String dbTypeName = "int";
        Map<String, String> handle = new Pop2Demo().handle(dbTypeName);
        handle.forEach((k, v) -> {
            System.out.println("k = " + k + ", v = " + v);
        });

    }

    public Map<String, String> handle(String dbFiledTypeName) {
        dbFiledTypeName = dbFiledTypeName.toLowerCase();

        Map<String, String> map = new HashMap<>();
        switch (dbFiledTypeName) {
            case "int":
            case "tinyint":
                map.put("javaTypeName", "Integer");
                map.put("classFullName", "java.lang.Integer");
                map.put("baseFlag", "1");  //魔法值，1 是基础包 2 不是基础包。
                break;
            case "varchar":
            case "char":
            case "text":
                map.put("javaTypeName", "String");
                map.put("classFullName", "java.lang.String");
                map.put("baseFlag", "1");
                break;
            case "bigint":
                map.put("javaTypeName", "Long");
                map.put("classFullName", "java.lang.Long");
                map.put("baseFlag", "1");
                break;
            default:
                throw new RuntimeException("未定义对应关系");
        }
        return map;
    }

}
