package com.xiaochen.lesson2;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by tanfujun on 11/9/16.
 * 说明Component间的依赖以及提供参数
 */

public class MyApplication extends Application {
    @Inject
    People mPeople;
    @Inject
    People mPeople2;

    AppComponent mAppComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mAppComponent.inject(this);
        Log.w("tan", mPeople.getPeopleName());
        Log.w("tan", mPeople.toString());
        Log.w("tan", mPeople2.toString());
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
