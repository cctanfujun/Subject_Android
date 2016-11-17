package com.xiaochen.lesson4.module;

import com.xiaochen.lesson4.bean.Pen;
import com.xiaochen.lesson4.bean.Student;
import com.xiaochen.lesson4.qualifer.BlackPen;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tanfujun on 11/10/16.
 */
@Module
public class MainActivityModule {

//    @Provides
//    Student provideStudent(@Named("white") Pen pen){
//        return new Student(pen);
//    }

    @Provides
    Student provideStudent(@BlackPen Pen pen){
        return new Student(pen);
    }
}
