package com.xiaochen.lesson2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tanfujun on 11/9/16.
 */
@Module
public class ActivityModule {
    MainActivity mActivity;

    public ActivityModule(MainActivity activity){
        mActivity =activity;
    }

    @PerActivity
    @Provides
    Student providesStudent(Body body){
        return new Student(body);
    }


}
