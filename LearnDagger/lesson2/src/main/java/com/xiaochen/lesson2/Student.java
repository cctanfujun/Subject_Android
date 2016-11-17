package com.xiaochen.lesson2;

/**
 * Created by tanfujun on 11/9/16.
 */

public class Student {
    public Body getBody() {
        return mBody;
    }

    public Student setBody(Body body) {
        mBody = body;
        return this;
    }

    private Body mBody;

    public Student(Body body) {
        this.mBody = body;
    }
}
