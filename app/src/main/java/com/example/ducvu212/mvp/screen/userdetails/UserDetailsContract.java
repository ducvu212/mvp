package com.example.ducvu212.mvp.screen.userdetails;

import com.example.ducvu212.mvp.screen.base.BasePresenter;
import com.example.ducvu212.mvp.screen.base.BaseView;

/**
 * Created by CuD HniM on 18/08/06.
 */
public interface UserDetailsContract {
    /**
     * Interface for View
     */

    interface View extends BaseView<UserDetailsContract.Presenter> {

    }

    /**
     * Interface for Presenter
     */

    interface Presenter extends BasePresenter {

    }
}
