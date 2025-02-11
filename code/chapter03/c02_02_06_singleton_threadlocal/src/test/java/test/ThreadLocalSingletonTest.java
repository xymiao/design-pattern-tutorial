package test;

import com.xymiao.tutorial.design.pattern.ThreadLocalSingleton;
import org.junit.jupiter.api.Test;

public class ThreadLocalSingletonTest {
    @Test
    public void test() {
        System.out.println("ThreadLocalSingletonTest.test");
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println("instance = " + instance);
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        System.out.println("instance2 = " + instance2);

        System.out.println("instance == instance2: " + (instance == instance2));
    }

    /**
     * 多线程测试 ThreadLocalSingleton 是否线程安全, 发现线程不安全
     */
    @Test
    public void test2() {
        class MyThread extends Thread {
            @Override
            public void run() {
                ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
                ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
                System.out.println("instance = " + instance);
                System.out.println("instance2 = " + instance2);
                System.out.println("instance == instance2: " + (instance == instance2));
            }
        }
        // 每个线程获取到的实例都是不同的， 说明线程不安全， 但是每个线程内部获取到的实例是相同的。
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
