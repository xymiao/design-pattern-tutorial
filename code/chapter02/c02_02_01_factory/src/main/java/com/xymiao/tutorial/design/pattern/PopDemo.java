package com.xymiao.tutorial.design.pattern;

/**
 * 获得数据库中字段类型的 Java 数据类型
 */
public class PopDemo {
    public static void main(String[] args) {
        String dbTypeName = "int";
        String typeName = new PopDemo().handle(dbTypeName);
        System.out.println("数据库字段类型为： " + dbTypeName
                + ", Java 的类型为：" + typeName);
    }

    public String handle(String dbFiledTypeName) {
        dbFiledTypeName = dbFiledTypeName.toLowerCase();
        String javaTypeName;
        if ("int".equals(dbFiledTypeName) ||
                "tinyint".equals(dbFiledTypeName)) {
            javaTypeName = "Integer";
        } else if ("varchar".equals(dbFiledTypeName) ||
                "char".equals(dbFiledTypeName) ||
                "text".equals(dbFiledTypeName)) {
            javaTypeName = "String";
        } else if ("bigint".equals(dbFiledTypeName)) {
            javaTypeName = "Long";
        } else {
            throw new RuntimeException("未定义对应关系");
        }
        return javaTypeName;
    }

}
