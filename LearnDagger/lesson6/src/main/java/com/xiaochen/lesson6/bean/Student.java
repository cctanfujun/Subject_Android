package com.xiaochen.lesson6.bean;

/**
 * Created by tanfujun on 11/10/16.
 */

public class Student {
    public String getName() {
        return mName;
    }

    public Student setName(String name) {
        mName = name;
        return this;
    }

    String mName;

    public Student() {
        mName = "tan";
    }
}
