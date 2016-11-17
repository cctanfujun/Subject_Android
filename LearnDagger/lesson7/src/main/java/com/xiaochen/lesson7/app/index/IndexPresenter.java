package com.xiaochen.lesson7.app.index;

import com.xiaochen.lesson7.data.Gank;
import com.xiaochen.lesson7.data.source.GanksRepository;

import java.util.List;

import javax.inject.Inject;

import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by tanfujun on 11/14/16.
 */

public class IndexPresenter implements IndexContract.Presenter {

    private  GanksRepository mGanksRepository;
    private  IndexContract.View mIndexView;

//    @Inject
//    public IndexPresenter(IndexContract.View indexView, GanksRepository repository) {
//        mIndexView = indexView;
//        mGanksRepository = repository;
//    }

    public IndexPresenter() {

    }

    @Inject
    void setupListener() {
        mIndexView.setPresenter(this);
    }

    @Override
    public void subscribe() {
        loadGanks(false);

    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void loadGanks(boolean forceUpdate) {
        mGanksRepository.getGanks()
                .subscribeOn(Schedulers.io())
                .subscribe(new Action1<List<Gank>>() {
                    @Override
                    public void call(List<Gank> ganks) {
                        mIndexView.showData(ganks);
                    }
                });
    }

    @Override
    public void openGankDetail(Gank gank) {

    }


}
