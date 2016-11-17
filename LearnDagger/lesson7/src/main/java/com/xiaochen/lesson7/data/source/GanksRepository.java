package com.xiaochen.lesson7.data.source;

import com.xiaochen.lesson7.data.Gank;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by tanfujun on 11/14/16.
 */

public class GanksRepository implements GankDataSource {

    private final GankDataSource mRemouteDataSource;

    @Inject
    public GanksRepository(GankDataSource remouteDataSource) {

        mRemouteDataSource = remouteDataSource;
    }


    @Override
    public Observable<List<Gank>> getGanks() {
        return mRemouteDataSource.getGanks();

    }

    @Override
    public Observable<Gank> getGank() {
        return null;
    }
}
