package com.example.ducvu212.mvp.screen.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;

/**
 * Created by CuD HniM on 18/08/06.
 */
public abstract class BaseFragment <BPresenter extends BasePresenter>
        extends Fragment
        implements BaseView<BPresenter> {
    private BPresenter mPresenter;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(getContentViewId(), container, false);
        ButterKnife.bind(view);
        mPresenter = createPresenter();
        initializeComponents(view);
        return view;
    }
    @Override
    public BPresenter getPresenter() {
        return mPresenter;
    }

    public abstract int getContentViewId();

    public abstract void initializeComponents(View view);
}
