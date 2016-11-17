package com.xiaochen.lesson7.app.index;


import com.xiaochen.lesson7.app.BasePresenter;
import com.xiaochen.lesson7.app.BaseView;
import com.xiaochen.lesson7.data.Gank;

import java.util.List;

/**
 * Created by tanfujun on 11/14/16.
 */

public interface IndexContract {

    interface Presenter extends BasePresenter {

        void loadGanks(boolean forceUpdate);

        void openGankDetail(Gank gank);

    }

    interface View extends BaseView<IndexPresenter> {

        void showData(List<Gank> ganks);

    }


}
