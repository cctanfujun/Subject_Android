package com.xiaochen.lesson7.data.source;

import com.xiaochen.lesson7.data.Gank;

import java.util.List;

import rx.Observable;

/**
 * Created by tanfujun on 11/14/16.
 */

public interface GankDataSource {
    Observable<List<Gank>> getGanks();
    Observable<Gank> getGank();
}
