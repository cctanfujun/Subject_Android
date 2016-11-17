package com.xiaochen.lesson6.component;


import com.xiaochen.lesson6.MainActivity;
import com.xiaochen.lesson6.module.MainActivityModule;
import com.xiaochen.lesson6.scope.PerActivity;

import dagger.Component;

/**
 * Created by tanfujun on 11/10/16.
 */
@Component(modules = MainActivityModule.class)
@PerActivity
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
