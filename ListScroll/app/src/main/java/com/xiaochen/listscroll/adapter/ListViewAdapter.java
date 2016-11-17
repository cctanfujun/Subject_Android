package com.xiaochen.listscroll.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.xiaochen.listscroll.data.TypeData;
import com.xiaochen.listscroll.itemView.AbsItemLayout;

import java.util.List;

/**
 * Created by tanfujun on 10/13/16.
 */

public class ListViewAdapter extends BaseAdapter {
    Context mContext;
    List<TypeData> mData;

    public ListViewAdapter(List<TypeData> data, Context context) {
        mContext = context;
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return ViewFactory.TOTAL_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).type;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int type = mData.get(position).type;
        TypeData typeData = mData.get(position);
        ItemViewHolder itemViewHolder = null;
        if (convertView == null) {
            AbsItemLayout absItemLayout = ViewFactory.createView(mContext, type);
            if (absItemLayout != null) {
                convertView = absItemLayout.onCreateView(mContext);
                itemViewHolder = new ItemViewHolder();
                itemViewHolder.layout = absItemLayout;
                convertView.setTag(itemViewHolder);
            }
        } else {
            itemViewHolder = (ItemViewHolder) convertView.getTag();
        }

        //bind
        itemViewHolder.layout.onBindView(typeData);

        return convertView;
    }


    public static class ItemViewHolder {
        public AbsItemLayout layout;
    }


}
