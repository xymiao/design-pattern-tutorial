package com.xymiao.tutorial.design.pattern.hungry;

public class HungryMain {
    public static void main(String[] args) {
        multiThread();
    }

    public static void singleThread() {
        WxPcApp wxPcApp = WxPcApp.build();
        WxPcApp wxPcApp2 = WxPcApp.build();
        System.out.println("wxPcApp  = " + wxPcApp + "\nwxPcApp2 = " + wxPcApp2);
        System.out.println("是否相等：" + (wxPcApp == wxPcApp2));
    }

    public static void multiThread() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(WxPcApp::build);
            thread.start();
        }
    }
}
