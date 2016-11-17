package com.xiaochen.listscroll.itemView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.xiaochen.listscroll.R;
import com.xiaochen.listscroll.data.Type3Data;

/**
 * Created by tanfujun on 10/14/16.
 */

public class Type3Layout extends AbsItemLayout<Type3Data> {
    ImageView mImageView1;
    ImageView mImageView2;
    ImageView mImageView3;

    @Override
    public View onCreateView(Context context) {
        mRootView = LayoutInflater.from(context).inflate(R.layout.item_type3,null,false);
        mImageView1 = (ImageView) mRootView.findViewById(R.id.item_type3_imageview1);


        return null;
    }

    @Override
    public void onBindView(Type3Data data) {

    }
}
