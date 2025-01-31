package com.xymiao.tutorial.design.pattern.hungry;

/**
 * 饿汉模式，应用启动自动创建实例，不管是否使用都会创建。
 */
public class WxPcApp {
    private final static WxPcApp wxPcApp = new  WxPcApp();
    // 这里为了方便查看是否为相同的实例。也可以使用对象标识。
    private final String startTip;
    private WxPcApp(){
        startTip = String.valueOf(System.currentTimeMillis());
        System.out.println("WxPcApp 创建实例为 " + startTip);
    }
    public static WxPcApp build(){
        System.out.println("WxPcApp 获得实例为 " + wxPcApp.startTip);
        return wxPcApp;
    }
}
