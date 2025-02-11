package com.xymiao.tutorial.design.pattern;

/**
 * 饿汉式单例
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    /**
     * 私有构造方法 使得该类无法在外部通过 new 进行实例化
     */
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
