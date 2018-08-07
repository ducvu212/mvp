package com.example.ducvu212.mvp.screen.userdetails;

import com.example.ducvu212.mvp.screen.base.BasePresenterImp;

/**
 * Created by CuD HniM on 18/08/06.
 */
public class UserDetailsPresenter extends BasePresenterImp<UserDetailsContract.View>
        implements UserDetailsContract.Presenter {
    public UserDetailsPresenter(UserDetailsContract.View view) {
        super(view);
    }
}
