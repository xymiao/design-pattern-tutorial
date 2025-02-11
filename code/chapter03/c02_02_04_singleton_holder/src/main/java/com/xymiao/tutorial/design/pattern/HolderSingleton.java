package com.xymiao.tutorial.design.pattern;

/**
 * HolderSingleton 静态内部类实现单例模式
 */
public class HolderSingleton {
    // 私有构造方法 禁止外部实例化
    private HolderSingleton() {}

    // 静态内部类 Holder 用于实例化 HolderSingleton 实例
    private static class Holder {
        // 这里由 jvm 保证 HolderSingleton 实例的线程安全
        static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    /**
     * HolderSingleton 实例获取方法
     * HolderSingletonHolder.INSTANCE 会触发 Holder 类的初始化， Holder 类的初始化是线程安全的
     * @return HolderSingleton 实例
     */
    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}