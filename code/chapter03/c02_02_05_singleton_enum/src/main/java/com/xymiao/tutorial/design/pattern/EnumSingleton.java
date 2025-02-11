package com.xymiao.tutorial.design.pattern;

/**
 * 枚举实现单例模式
 * 优点：线程安全，防止反射和序列化攻击
 * 缺点：无法懒加载 (lazy loading) 和传递参数 (passing parameters)
 */
public enum EnumSingleton {
    // 枚举实例
    INSTANCE;
    // 枚举实例方法
    public void doSomething() {
        System.out.println("Singleton Action");
    }
}