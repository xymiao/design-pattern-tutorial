package com.xymiao.tutorial.design.pattern.factory01;

public interface DataTypeBase {
    class Result {
        public Result(String javaTypeName, String javaClassName, String baseFlag) {
            this.baseFlag = baseFlag;
            this.javaClassName = javaClassName;
            this.javaTypeName = javaTypeName;
        }

        private final String javaTypeName;
        private final String javaClassName;
        private final String baseFlag;


        @Override
        public String toString() {
            return "Result{" +
                    "javaTypeName='" + javaTypeName + '\'' +
                    ", javaClassName='" + javaClassName + '\'' +
                    ", baseFlag='" + baseFlag + '\'' +
                    '}';
        }
    }

    Result getJavaTypeInfo();

    default Result getInfo(Class<?> clazz) {
        String javaTypeName = clazz.getSimpleName();
        String javaClassName = clazz.getName();
        String baseFlag = "java.lang".equals(clazz.getPackage().getName()) ? "1" : "2";
        return new DataTypeBase.Result(javaTypeName,
                javaClassName, baseFlag);
    }
}
