package test;

import com.xymiao.tutorial.design.pattern.HolderSingleton;
import org.junit.jupiter.api.Test;

public class HolderSingletonTest {
    @Test
    public void test() {
        System.out.println("HolderSingletonTest.test");
        HolderSingleton instance = HolderSingleton.getInstance();
        System.out.println("instance = " + instance);
        HolderSingleton instance2 = HolderSingleton.getInstance();
        System.out.println("instance2 = " + instance2);

        System.out.println("instance == instance2: " + (instance == instance2));
    }

    /**
     * 多线程测试 HolderSingleton 是否线程安全, 发现线程不安全
     */
    @Test
    public void test2() {
        class MyThread extends Thread {
            @Override
            public void run() {
                HolderSingleton instance = HolderSingleton.getInstance();
                System.out.println("instance = " + instance);
            }
        }
        // 10 线程同时获取 HolderSingleton 实例， 会发现有多个实例被创建。
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
