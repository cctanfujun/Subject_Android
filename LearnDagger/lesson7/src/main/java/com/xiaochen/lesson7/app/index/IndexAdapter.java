package com.xiaochen.lesson7.app.index;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.xiaochen.lesson7.data.Gank;

import java.util.List;

/**
 * Created by tanfujun on 11/14/16.
 */

public class IndexAdapter extends RecyclerView.Adapter {
    private List<Gank> mGanks;

    IndexAdapter(List<Gank> ganks) {
        mGanks = ganks;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mGanks.size();
    }

    public void replaceData(List<Gank> ganks) {
        mGanks = ganks;
        notifyDataSetChanged();
    }


}
