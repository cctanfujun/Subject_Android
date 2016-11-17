package com.xiaochen.lesson4.component;

import com.xiaochen.lesson4.MainActivity;
import com.xiaochen.lesson4.module.MainActivityModule;
import com.xiaochen.lesson4.module.PenModule;

import dagger.Component;

/**
 * Created by tanfujun on 11/10/16.
 */
@Component(modules = {PenModule.class, MainActivityModule.class})
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
