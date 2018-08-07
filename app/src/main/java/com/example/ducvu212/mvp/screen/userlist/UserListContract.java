package com.example.ducvu212.mvp.screen.userlist;

import com.example.ducvu212.mvp.data.model.User;
import com.example.ducvu212.mvp.screen.base.BasePresenter;
import com.example.ducvu212.mvp.screen.base.BaseView;
import java.util.List;

/**
 * Created by CuD HniM on 18/08/06.
 */
public interface UserListContract {

    /**
     * Interface for View
     */

    interface View extends BaseView<Presenter> {
       void Success(List<User> users);
       void NetworkError();
       void Error();
    }

    /**
     * Interface for Presenter
     */

    interface Presenter extends BasePresenter {
        void searchUser(String text);
    }
}
