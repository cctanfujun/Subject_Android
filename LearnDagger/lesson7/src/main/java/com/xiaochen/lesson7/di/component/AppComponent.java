package com.xiaochen.lesson7.di.component;

import android.app.Application;

import com.xiaochen.lesson7.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by tanfujun on 11/14/16.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface AppComponent {
    Application getApplication();

    OkHttpClient getOkHttpClient();

    Retrofit getRetrofit();
}
