package com.xiaochen.lesson7.data.source.local;

import com.xiaochen.lesson7.data.Gank;
import com.xiaochen.lesson7.data.source.GankDataSource;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

/**
 * Created by tanfujun on 11/14/16.
 */
@Singleton
public class GanksLocalDataSource implements GankDataSource {

    @Inject
    public GanksLocalDataSource() {
    }

    @Override
    public Observable<List<Gank>> getGanks() {
        return null;
    }

    @Override
    public Observable<Gank> getGank() {
        return null;
    }
}
