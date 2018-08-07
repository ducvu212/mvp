package com.example.ducvu212.mvp.screen.main;

import android.support.v4.app.FragmentManager;
import com.example.ducvu212.mvp.screen.base.BasePresenter;
import com.example.ducvu212.mvp.screen.base.BaseView;

/**
 * Created by CuD HniM on 18/08/06.
 */
public interface MainConstract {

    /**
     * Interface for View
     */

    interface View extends BaseView<MainConstract.Presenter>{

    }

    /**
     * Interface for Presenter
     */

    interface Presenter extends BasePresenter {
        void addFragment(FragmentManager manager);
    }
}
