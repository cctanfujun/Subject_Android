package com.xiaochen.listscroll.itemView;

import android.content.Context;
import android.view.View;

/**
 * Created by tanfujun on 10/13/16.
 */

public abstract class AbsItemLayout<T> {
    public View mRootView;

    public abstract View onCreateView(Context context);

    public abstract void onBindView(T data);

}
