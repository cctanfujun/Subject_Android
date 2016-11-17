package com.xiaochen.lesson1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

/**
 * dagger2 的常规使用
 */

public class MainActivity extends AppCompatActivity {
    @Inject
    Student mStudent;

    @Inject
    Student mStudent2;

    @Inject

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);
        Log.w("tan", mStudent.getName());

    }
}
