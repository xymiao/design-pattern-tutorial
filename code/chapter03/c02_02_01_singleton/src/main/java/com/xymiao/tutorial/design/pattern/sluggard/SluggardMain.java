package com.xymiao.tutorial.design.pattern.sluggard;

public class SluggardMain {
    public static void main(String[] args) {
        multiThreadSyncBlock();
    }

    public static void singleThread() {
        System.out.println("单线程模式");
        WxPcApp wxPcApp = WxPcApp.build();
        WxPcApp wxPcApp2 = WxPcApp.build();
        System.out.println("wxPcApp  = " + wxPcApp + "\nwxPcApp2 = " + wxPcApp2);
        System.out.println("是否相等：" + (wxPcApp == wxPcApp2));
        wxPcApp.startApp();
        wxPcApp2.startApp();
    }

    public static void multiThread() {
        System.out.println("多线程模式");
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(WxPcApp::build);
            thread.start();
        }
    }

    public static void multiThreadSyncMethod() {
        System.out.println("多线程模式");
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(WxPcApp::buildSyncMethod);
            thread.start();
        }
    }

    public static void multiThreadSyncBlock() {
        System.out.println("多线程模式");
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(WxPcApp::buildSyncBlock);
            thread.start();
        }
    }



}
