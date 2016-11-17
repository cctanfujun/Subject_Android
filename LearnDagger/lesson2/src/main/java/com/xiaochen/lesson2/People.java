package com.xiaochen.lesson2;

/**
 * Created by tanfujun on 11/9/16.
 */

public class People {
    public String getPeopleName() {
        return peopleName;
    }

    public People setPeopleName(String peopleName) {
        this.peopleName = peopleName;
        return this;
    }

    private String peopleName;

    People(String peopleName){
        this.peopleName = peopleName;

    }
}
