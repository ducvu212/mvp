package com.example.ducvu212.mvp.sceen.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by CuD HniM on 18/08/06.
 */
public abstract class BaseActivity<BPresenter extends BasePresenter>
        extends AppCompatActivity
        implements BaseView<BPresenter> {
    private BPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int contentViewId = getContentViewId();
        if (contentViewId <= 0) {
            return;
        }
        setContentView(contentViewId);
        mPresenter = createPresenter();
        initializeComponents();
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            finish();
            return;
        }
        super.onBackPressed();
    }

    @Override
    public BPresenter getPresenter() {
        return mPresenter;
    }

    public abstract int getContentViewId();

    public abstract void initializeComponents();
}
