package com.example.ducvu212.mvp.sceen.userlist;

import com.example.ducvu212.mvp.sceen.base.BasePresenter;
import com.example.ducvu212.mvp.sceen.base.BaseView;

/**
 * Created by CuD HniM on 18/08/06.
 */
public interface UserListContract {

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
