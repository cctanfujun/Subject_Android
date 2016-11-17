package com.xiaochen.listscroll.itemView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.xiaochen.listscroll.R;
import com.xiaochen.listscroll.data.Type1Data;

/**
 * Created by tanfujun on 10/13/16.
 */

public class Type1Layout extends AbsItemLayout<Type1Data> {
    public TextView mTextView1;
    public TextView mTextView2;
    public TextView mTextView3;

    @Override
    public View onCreateView(Context context) {
        mRootView = LayoutInflater.from(context).inflate(R.layout.item_type1, null, false);
        mTextView1 = (TextView) mRootView.findViewById(R.id.item_type1_textview1);
        mTextView2 = (TextView) mRootView.findViewById(R.id.item_type1_textview2);
        mTextView3 = (TextView) mRootView.findViewById(R.id.item_type1_textview3);
        return mRootView;
    }

    @Override
    public void onBindView(Type1Data data) {
        mTextView1.setText(data.text1str);
        mTextView2.setText(data.text2str);
        mTextView3.setText(data.text3str);
    }


}
