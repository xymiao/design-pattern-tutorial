package com.xymiao.tutorial.design.pattern;

public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> INSTANCE =
        ThreadLocal.withInitial(() -> new ThreadLocalSingleton());
    
    private ThreadLocalSingleton() {}
    
    public static ThreadLocalSingleton getInstance() {
        return INSTANCE.get();
    }
}