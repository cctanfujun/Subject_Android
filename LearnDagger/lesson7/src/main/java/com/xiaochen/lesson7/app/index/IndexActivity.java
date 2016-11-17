package com.xiaochen.lesson7.app.index;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.xiaochen.lesson7.R;
import com.xiaochen.lesson7.common.AbsActivity;

/**
 * 配合MVP使用Dagger2
 * <p>
 * 主页
 */
public class IndexActivity extends AbsActivity {
    FrameLayout mContentFrame;
    IndexFragement indexFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        mContentFrame = (FrameLayout) findViewById(R.id.contentFrame);
        indexFragment = IndexFragement.newInstance();

        getFragmentManager().beginTransaction()
                .add(R.id.contentFrame, indexFragment)
                .commit();
    }
}
