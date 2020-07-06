package com.demo.durationcountingdemo;

import android.app.Application;
import android.content.Intent;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActivityLifeCycle lifecycleCallbacks = new ActivityLifeCycle();
        registerActivityLifecycleCallbacks(lifecycleCallbacks);

//        new Intent()
    }
}
