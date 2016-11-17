package com.xiaochen.lesson2;

import dagger.Component;

/**
 * Created by tanfujun on 11/9/16.
 */
@PerActivity
@Component(modules = ActivityModule.class,dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
