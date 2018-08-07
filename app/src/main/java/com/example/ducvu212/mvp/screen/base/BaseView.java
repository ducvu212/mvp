package com.example.ducvu212.mvp.screen.base;

/**
 * Created by CuD HniM on 18/08/06.
 */
public interface BaseView <BPresenter extends BasePresenter> {
    BPresenter getPresenter();

    BPresenter createPresenter();
}
