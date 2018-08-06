package com.example.ducvu212.mvp.sceen.main;

import com.example.ducvu212.mvp.sceen.base.BasePresenter;
import com.example.ducvu212.mvp.sceen.base.BaseView;

/**
 * Created by CuD HniM on 18/08/06.
 */
public interface MainConstract {

    /**
     * Interface for View
     */

    interface View extends BaseView<Presenter>{
        void addFragment();
    }

    /**
     * Interface for Presenter
     */

    interface Presenter extends BasePresenter {

    }
}
