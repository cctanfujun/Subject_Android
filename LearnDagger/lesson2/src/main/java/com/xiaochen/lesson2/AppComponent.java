package com.xiaochen.lesson2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tanfujun on 11/9/16.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface AppComponent {
    void inject(MyApplication application);
    Body getBody();
}
