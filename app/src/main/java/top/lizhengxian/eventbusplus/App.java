package top.lizhengxian.eventbusplus;

import android.app.Application;

import org.greenrobot.eventbus.EventBus;

import top.lizhengxian.EBIndex;


public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.builder().addIndex(new EBIndex()).installDefaultEventBus();
    }
}
