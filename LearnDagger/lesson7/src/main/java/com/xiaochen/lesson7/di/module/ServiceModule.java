package com.xiaochen.lesson7.di.module;

import com.xiaochen.lesson7.data.source.remoute.GankService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by tanfujun on 11/16/16.
 */
@Module
public class ServiceModule {

    @Singleton
    @Provides
    GankService provideGankService(Retrofit retrofit) {
        return retrofit.create(GankService.class);
    }
}
