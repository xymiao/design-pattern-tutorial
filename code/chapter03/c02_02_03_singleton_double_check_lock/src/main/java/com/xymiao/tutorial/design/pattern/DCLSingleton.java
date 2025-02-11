package com.xymiao.tutorial.design.pattern;

/**
 * 双重检查锁定（DCL）单例模式
 */
public class DCLSingleton {
    // 必须使用 volatile 防止指令重排序, 保证 instance 的可见性, 保证线程安全
    private static volatile DCLSingleton instance;
    
    private DCLSingleton() {}
    
    public static DCLSingleton getInstance() {
        // 第一次检查， 如果 instance 不为 null, 直接返回实例
        if (instance == null) {
            // 同步代码块
            synchronized (DCLSingleton.class) {
                // 第二次检查，如果 instance 仍然为 null, 创建实例
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}