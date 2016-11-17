package com.xiaochen.lesson7.app;

import android.app.Application;

import com.xiaochen.lesson7.di.component.AppComponent;
import com.xiaochen.lesson7.di.component.DaggerAppComponent;
import com.xiaochen.lesson7.di.module.ApplicationModule;

/**
 * Created by tanfujun on 11/14/16.
 */

public class GankApplication extends Application {

    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
