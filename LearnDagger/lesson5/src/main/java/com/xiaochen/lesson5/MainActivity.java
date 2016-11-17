package com.xiaochen.lesson5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xiaochen.lesson5.bean.Student;
import com.xiaochen.lesson5.component.DaggerMainActivityComponent;
import com.xiaochen.lesson5.module.MainActivityModule;

import javax.inject.Inject;

/**
 * 理解Scope
 */
public class MainActivity extends AppCompatActivity {
    @Inject
    Student mStudent;
    @Inject
    Student mStudent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule())
                .build()
                .inject(this);
        Log.w("tan",mStudent.toString());
        Log.w("tan",mStudent2.toString());
    }
}
