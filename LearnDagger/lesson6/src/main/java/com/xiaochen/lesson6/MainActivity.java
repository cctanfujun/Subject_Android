package com.xiaochen.lesson6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.xiaochen.lesson6.bean.Student;
import com.xiaochen.lesson6.component.DaggerMainActivityComponent;
import com.xiaochen.lesson6.module.MainActivityModule;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * lazy 对象注入时候生成的是lazy对象 调用get的时候初始化
 */
public class MainActivity extends AppCompatActivity {
    @Inject
    Lazy<Student> mStudent;
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
        Log.w("tan", mStudent.get().getName());
    }
}
