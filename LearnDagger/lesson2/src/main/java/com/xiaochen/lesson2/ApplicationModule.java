package com.xiaochen.lesson2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tanfujun on 11/9/16.
 */
@Module
public class ApplicationModule {
    MyApplication mApplication;

    public ApplicationModule(MyApplication application) {
        this.mApplication = application;
    }

    @Provides
    People providesPeople() {
        return new People("people");
    }

    @Provides
    Body providesBody(){
        return new Body();
    }
}
