package com.xiaochen.lesson4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.xiaochen.lesson4.bean.Student;
import com.xiaochen.lesson4.component.DaggerMainActivityComponent;
import com.xiaochen.lesson4.module.MainActivityModule;

import javax.inject.Inject;

/**
 * 限定符的使用
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    Student mStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule())
                .build()
                .inject(this);

        mStudent.getPen().write();
    }
}
