package com.xiaochen.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

/**
 * @Inject 使用
 */
public class MainActivity extends AppCompatActivity {
    @Inject
    Student mStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent.builder().build().inject(this);
        mStudent.setName("123");
        Log.w("tan",mStudent.getName());
    }
}
