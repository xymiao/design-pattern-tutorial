package com.xymiao.tutorial.design.pattern;

public class UnsafeLazySingleton {
    private static UnsafeLazySingleton instance;
    
    private UnsafeLazySingleton() {}
    
    public static UnsafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new UnsafeLazySingleton();
        }
        return instance;
    }
}