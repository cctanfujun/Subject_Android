package com.xiaochen.lesson7.app.index;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiaochen.lesson7.R;
import com.xiaochen.lesson7.app.GankApplication;
import com.xiaochen.lesson7.common.AbsFragment;
import com.xiaochen.lesson7.data.Gank;
import com.xiaochen.lesson7.di.component.DaggerFragmentComponent;
import com.xiaochen.lesson7.di.module.FragmentModule;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import static dagger.internal.Preconditions.checkNotNull;

/**
 * Created by tanfujun on 11/14/16.
 */

public class IndexFragement extends AbsFragment implements IndexContract.View {

    @Inject IndexPresenter mIndexPresenter;
    RecyclerView mRecyclerView;
    IndexAdapter mAdapter;


    public static IndexFragement newInstance() {
        return new IndexFragement();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerFragmentComponent.builder()
                .appComponent(((GankApplication)getActivity().getApplication()).getAppComponent())
                .fragmentModule(new FragmentModule(this))
                .build()
                .inject(this);
        mAdapter = new IndexAdapter(new ArrayList<Gank>(0));
        if (mIndexPresenter == null) {
            Log.w("tan", "fail");
        }else{
            Log.w("tan", "success");
        }


    }

    @Override
    public void onResume() {
        super.onResume();
        mIndexPresenter.loadGanks(false);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_index, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }

    @Override
    public void showData(List<Gank> ganks) {
        mAdapter.replaceData(ganks);

    }

    @Override
    public void setPresenter(IndexPresenter presenter) {
        mIndexPresenter = checkNotNull(presenter);

    }


}
