package com.xiaochen.lesson4.module;

import com.xiaochen.lesson4.bean.BlackPen;
import com.xiaochen.lesson4.bean.Pen;
import com.xiaochen.lesson4.bean.WhitePen;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tanfujun on 11/10/16.
 */
@Module
public class PenModule {

//    @Named("black")
//    @Provides
//    Pen providesBlackPen(){
//        return new BlackPen();
//    }
//    @Named("white")
//    @Provides
//    Pen providesWhitePen(){
//        return new WhitePen();
//    }
    @com.xiaochen.lesson4.qualifer.BlackPen
    @Provides
    Pen providesBlackPen(){
        return new BlackPen();
    }
    @com.xiaochen.lesson4.qualifer.WhitePen
    @Provides
    Pen providesWhitePen(){
        return new WhitePen();
    }
}
