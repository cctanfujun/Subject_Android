package com.xiaochen.lesson6.module;


import com.xiaochen.lesson6.bean.Student;
import com.xiaochen.lesson6.scope.PerActivity;

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
