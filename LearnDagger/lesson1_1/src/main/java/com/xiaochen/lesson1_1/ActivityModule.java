package com.xiaochen.lesson1_1;

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


    @Provides
    Student providesStudent(){
        return new Student("tan");
    }


}
