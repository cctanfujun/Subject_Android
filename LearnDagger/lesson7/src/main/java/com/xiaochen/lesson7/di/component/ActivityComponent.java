package com.xiaochen.lesson7.di.component;

import android.app.Activity;

import com.xiaochen.lesson7.di.scope.PerActivity;

import dagger.Component;

/**
 * Created by tanfujun on 11/16/16.
 */
@PerActivity
@Component(dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(Activity activity);
}
