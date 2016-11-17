package com.xiaochen.lesson7.data.source.remoute;

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
public class GanksRemoteDataSource implements GankDataSource{

    private GankService mGankService;

    @Inject public GanksRemoteDataSource(ServiceManager serviceManager) {
        mGankService = serviceManager.getGankService();
    }

    @Override
    public Observable<List<Gank>> getGanks() {
        Observable<List<Gank>> ganks = mGankService
                .getGanks();
        return ganks;
    }

    @Override
    public Observable<Gank> getGank() {
        return null;
    }
}
