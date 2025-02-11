package test;

import com.xymiao.tutorial.design.pattern.EnumSingleton;
import org.junit.jupiter.api.Test;

public class EnumSingletonTest {
    @Test
    public void test() {
        System.out.println("EnumSingletonTest.test");
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println("instance = " + instance);
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println("instance2 = " + instance2);

        System.out.println("instance == instance2: " + (instance == instance2));
    }

    /**
     * 多线程测试 EnumSingleton 是否线程安全, 发现线程不安全
     */
    @Test
    public void test2() {
        class MyThread extends Thread {
            @Override
            public void run() {
                EnumSingleton instance = EnumSingleton.INSTANCE;
                System.out.println("instance = " + instance);
            }
        }
        // 10 线程同时获取 EnumSingleton 实例， 会发现有多个实例被创建。
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
