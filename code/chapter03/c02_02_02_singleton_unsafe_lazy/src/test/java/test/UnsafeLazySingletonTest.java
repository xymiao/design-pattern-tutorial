package test;

import com.xymiao.tutorial.design.pattern.UnsafeLazySingleton;
import org.junit.jupiter.api.Test;

public class UnsafeLazySingletonTest {
    @Test
    public void test() {
        System.out.println("UnsafeLazySingletonTest.test");
        UnsafeLazySingleton instance = UnsafeLazySingleton.getInstance();
        System.out.println("instance = " + instance);
        UnsafeLazySingleton instance2 = UnsafeLazySingleton.getInstance();
        System.out.println("instance2 = " + instance2);

        System.out.println("instance == instance2: " + (instance == instance2));
    }

    /**
     * 多线程测试 UnsafeLazySingleton 是否线程安全, 发现线程不安全
     */
    @Test
    public void test2() {
        class MyThread extends Thread {
            @Override
            public void run() {
                UnsafeLazySingleton instance = UnsafeLazySingleton.getInstance();
                System.out.println("instance = " + instance);
            }
        }
        // 10 线程同时获取 UnsafeLazySingleton 实例， 会发现有多个实例被创建。
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
