package com.xymiao.tutorial.design.pattern;

/**
 * 饿汉式单例, 通过静态代码块初始化
 */
public class EagerCodeBlockSingleton {
    private static EagerCodeBlockSingleton INSTANCE = null;

    static {
        INSTANCE = new EagerCodeBlockSingleton();
    }

    /**
     * 私有构造方法 使得该类无法在外部通过 new 进行实例化
     */
    private EagerCodeBlockSingleton() {
    }

    public static EagerCodeBlockSingleton getInstance() {
        return INSTANCE;
    }
}
