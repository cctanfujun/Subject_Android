package com.xiaochen.lesson5.module;

import com.xiaochen.lesson5.bean.Student;
import com.xiaochen.lesson5.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tanfujun on 11/10/16.
*/
@Module
public class MainActivityModule {
    @Provides
    @PerActivity
    Student providesStudent() {
        return new Student();
    }
}
