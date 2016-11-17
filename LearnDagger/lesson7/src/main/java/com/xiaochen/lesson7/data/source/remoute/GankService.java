package com.xiaochen.lesson7.data.source.remoute;

import com.xiaochen.lesson7.data.Gank;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by tanfujun on 11/16/16.
 */

public interface GankService {
    @GET("/data/Android/10/1")
    Observable<List<Gank>> getGanks();
}
