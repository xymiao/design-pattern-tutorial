package test;

import com.xymiao.tutorial.design.pattern.EagerSingleton;
import org.junit.jupiter.api.Test;

public class EagerSingletonTest {
    @Test
    public void test() {
        System.out.println("EagerSingletonTest.test");
        EagerSingleton instance = EagerSingleton.getInstance();
        System.out.println("instance = " + instance);
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println("instance2 = " + instance2);

        System.out.println("instance == instance2: " + (instance == instance2));
    }

    /**
     * 多线程测试 EagerSingleton 是否线程安全
     */
    @Test
    public void test2() {
        class MyThread extends Thread {
            @Override
            public void run() {
                EagerSingleton instance = EagerSingleton.getInstance();
                System.out.println("instance = " + instance);
            }
        }
        // 10 threads to get the same instance
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }

    }
}
