package com.xiaochen.lesson7.data.source.remoute;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by tanfujun on 11/16/16.
 */

@Singleton
public class ServiceManager {
    private GankService mGankService;

    @Inject
    public ServiceManager(GankService gankService) {
        mGankService = gankService;
    }

    public GankService getGankService() {
        return mGankService;
    }

}
