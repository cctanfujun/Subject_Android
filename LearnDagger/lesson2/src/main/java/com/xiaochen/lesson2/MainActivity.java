package com.xiaochen.lesson2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * dagger2 的常规使用
 */

public class MainActivity extends AppCompatActivity {
    @Inject
    Student mStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent.builder()
                .appComponent(((MyApplication)getApplication()).getAppComponent())
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);
        Log.w("tan", mStudent.getBody().toString());

    }
}