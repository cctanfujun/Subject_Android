package com.xiaochen.lesson7.di.module;

import com.xiaochen.lesson7.app.index.IndexContract;
import com.xiaochen.lesson7.app.index.IndexPresenter;
import com.xiaochen.lesson7.di.scope.PerFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tanfujun on 11/16/16.
 */
@Module
public class FragmentModule {
    private IndexContract.View view;

    public FragmentModule(IndexContract.View view) {
        this.view = view;
    }


    @PerFragment
    @Provides
    IndexPresenter provideIndexPresneter(){
        return new IndexPresenter();
    }


}
