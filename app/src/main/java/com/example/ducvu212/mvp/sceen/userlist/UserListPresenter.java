package com.example.ducvu212.mvp.sceen.userlist;

import com.example.ducvu212.mvp.sceen.base.BasePresenterImp;

/**
 * Created by CuD HniM on 18/08/06.
 */
public class UserListPresenter extends BasePresenterImp<UserListContract.View>
        implements UserListContract.Presenter {
    public UserListPresenter(UserListContract.View view) {
        super(view);
    }
}
