package com.francis.framework.activity;

import android.app.Application;

public class BaseApplication extends Application {
    private static BaseApplication mInstance;
    // private Gson mG;
    public static BaseApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
        Thread.currentThread().setUncaughtExceptionHandler(crashHandler);
    }


    @Override
    public void onLowMemory() {
        // TODO Auto-generated method stub
        android.os.Process.killProcess(android.os.Process.myPid());
        super.onLowMemory();
    }

}
