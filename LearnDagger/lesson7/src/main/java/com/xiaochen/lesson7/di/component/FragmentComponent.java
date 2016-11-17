package com.xiaochen.lesson7.di.component;

import android.app.Fragment;

import com.xiaochen.lesson7.di.module.FragmentModule;
import com.xiaochen.lesson7.di.scope.PerFragment;

import dagger.Component;

/**
 * Created by tanfujun on 11/16/16.
 */
@PerFragment
@Component(modules = FragmentModule.class,dependencies = AppComponent.class)
public interface FragmentComponent {
    void inject(Fragment fragment);
}
