package com.xiaochen.lesson4.bean;

/**
 * Created by tanfujun on 11/10/16.
 */

public class Student {
    public Pen getPen() {
        return mPen;
    }

    Pen mPen;
    public Student (Pen pen){
        this.mPen = pen;
    }
}
