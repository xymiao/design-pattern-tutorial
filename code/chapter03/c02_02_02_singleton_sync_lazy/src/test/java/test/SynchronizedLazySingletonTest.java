package test;

import com.xymiao.tutorial.design.pattern.SynchronizedLazySingleton;
import org.junit.jupiter.api.Test;

public class SynchronizedLazySingletonTest {
    @Test
    public void test() {
        System.out.println("SynchronizedLazySingletonTest.test");
        SynchronizedLazySingleton instance = SynchronizedLazySingleton.getInstance();
        System.out.println("instance = " + instance);
        SynchronizedLazySingleton instance2 = SynchronizedLazySingleton.getInstance();
        System.out.println("instance2 = " + instance2);

        System.out.println("instance == instance2: " + (instance == instance2));
    }

    /**
     * 多线程测试 SynchronizedLazySingleton 是否线程安全
     */
    @Test
    public void test2() {
        class MyThread extends Thread {
            @Override
            public void run() {
                SynchronizedLazySingleton instance = SynchronizedLazySingleton.getInstance();
                System.out.println("instance = " + instance);
            }
        }
        // 10 线程同时获取 SynchronizedLazySingleton 实例， 会发现有多个实例被创建。
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
