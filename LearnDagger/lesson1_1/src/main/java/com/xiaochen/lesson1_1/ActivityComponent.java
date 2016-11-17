package com.xiaochen.lesson1_1;

import dagger.Component;

/**
 * Created by tanfujun on 11/9/16.
 */
@Component(modules = {ActivityModule.class,})
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
