package com.xiaochen.lesson5.component;

import com.xiaochen.lesson5.MainActivity;
import com.xiaochen.lesson5.module.MainActivityModule;
import com.xiaochen.lesson5.scope.PerActivity;

import dagger.Component;

/**
 * Created by tanfujun on 11/10/16.
 */
@PerActivity
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
