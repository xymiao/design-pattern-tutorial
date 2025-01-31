package com.xymiao.tutorial.design.pattern.sluggard;

import java.util.Objects;

public class WxPcApp {
    private static WxPcApp wxPcApp;

    private WxPcApp(){
        System.out.println("WxPcApp 创建实例为 " + wxPcApp);
    }
    public static WxPcApp build()  {
        if(Objects.isNull(wxPcApp)){
            wxPcApp = new WxPcApp();
        }
        System.out.println("WxPcApp 获得实例为 " + wxPcApp);
        return wxPcApp;
    }

    public static synchronized WxPcApp buildSyncMethod()  {
        if(Objects.isNull(wxPcApp)){
            wxPcApp = new WxPcApp();
        }
        System.out.println("WxPcApp 获得实例为 " + wxPcApp);
        return wxPcApp;
    }

    public static  WxPcApp buildSyncBlock()  {
        if(Objects.isNull(wxPcApp)){
            synchronized(WxPcApp.class){
                if(Objects.isNull(wxPcApp)){
                    wxPcApp = new WxPcApp();
                }
            }
        }
        System.out.println("WxPcApp 获得实例为 " + wxPcApp);
        return wxPcApp;
    }

    public void startApp(){
        System.out.println("启动应用 wxPcApp = " + wxPcApp);
    }
}
