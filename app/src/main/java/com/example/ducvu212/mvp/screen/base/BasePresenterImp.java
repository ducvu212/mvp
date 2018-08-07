package com.example.ducvu212.mvp.screen.base;

/**
 * Created by CuD HniM on 18/08/06.
 */
public class BasePresenterImp<BView extends BaseView> implements BasePresenter {
    private BView mView;

    public BasePresenterImp(BView view) {
        this.mView = view;
    }

    public BView getView() {
        return mView;
    }
}
