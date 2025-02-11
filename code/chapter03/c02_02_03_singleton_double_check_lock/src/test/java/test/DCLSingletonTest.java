package test;

import com.xymiao.tutorial.design.pattern.DCLSingleton;
import org.junit.jupiter.api.Test;

public class DCLSingletonTest {
    @Test
    public void test() {
        System.out.println("DCLSingletonTest.test");
        DCLSingleton instance = DCLSingleton.getInstance();
        System.out.println("instance = " + instance);
        DCLSingleton instance2 = DCLSingleton.getInstance();
        System.out.println("instance2 = " + instance2);

        System.out.println("instance == instance2: " + (instance == instance2));
    }

    /**
     * 多线程测试 DCLSingleton 是否线程安全, 发现线程不安全
     */
    @Test
    public void test2() {
        class MyThread extends Thread {
            @Override
            public void run() {
                DCLSingleton instance = DCLSingleton.getInstance();
                System.out.println("instance = " + instance);
            }
        }
        // 10 线程同时获取 DCLSingleton 实例， 会发现有多个实例被创建。
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
