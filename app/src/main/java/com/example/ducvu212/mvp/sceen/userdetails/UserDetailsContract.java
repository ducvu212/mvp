package com.example.ducvu212.mvp.sceen.userdetails;

import com.example.ducvu212.mvp.sceen.base.BasePresenter;
import com.example.ducvu212.mvp.sceen.base.BaseView;
import com.example.ducvu212.mvp.sceen.main.MainConstract;

/**
 * Created by CuD HniM on 18/08/06.
 */
public interface UserDetailsContract {
    /**
     * Interface for View
     */

    interface View extends BaseView<Presenter> {

    }

    /**
     * Interface for Presenter
     */

    interface Presenter extends BasePresenter {

    }
}
