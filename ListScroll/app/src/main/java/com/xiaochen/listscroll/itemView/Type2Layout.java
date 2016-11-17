package com.xiaochen.listscroll.itemView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.xiaochen.listscroll.R;
import com.xiaochen.listscroll.data.Type2Data;

/**
 * Created by tanfujun on 10/13/16.
 */

public class Type2Layout extends AbsItemLayout<Type2Data> {
    Context mContext;
    ImageView mImageView1;
    ImageView mImageView2;

    @Override
    public View onCreateView(Context context) {
        mContext = context;
        mRootView = LayoutInflater.from(context).inflate(R.layout.item_type2, null, false);
        mImageView1 = (ImageView) mRootView.findViewById(R.id.item_type2_imageview1);
        mImageView2 = (ImageView) mRootView.findViewById(R.id.item_type2_imageview2);
        return mRootView;
    }

    @Override
    public void onBindView(Type2Data data) {
        Picasso.with(mContext).load(data.img1).into(mImageView1, new Callback() {
            @Override
            public void onSuccess() {
                Log.w("tan","load img success");
            }

            @Override
            public void onError() {

                Log.w("tan","load img error");

            }
        });
        Picasso.with(mContext).load(data.img2).into(mImageView2, new Callback() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onError() {

            }
        });

    }
}
