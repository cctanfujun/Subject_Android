package com.xiaochen.lesson1_1;

/**
 * Created by tanfujun on 11/9/16.
 */

public class Student {
    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    private String name;

    public Student(String name){
        this.name = name;
    }
}
