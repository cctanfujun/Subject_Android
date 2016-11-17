package com.xiaochen.lesson1;

import dagger.Component;

/**
 * Created by tanfujun on 11/9/16.
 */
@Component
public interface ActivityComponent{
    void inject(MainActivity mainActivity);
}



