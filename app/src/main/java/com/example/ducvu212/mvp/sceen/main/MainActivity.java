package com.example.ducvu212.mvp.sceen.main;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import butterknife.ButterKnife;
import com.example.ducvu212.mvp.R;
import com.example.ducvu212.mvp.sceen.base.BaseActivity;
import com.example.ducvu212.mvp.sceen.userlist.UserListFragment;

public class MainActivity extends BaseActivity<MainConstract.Presenter>
        implements MainConstract.View {

    /**
     * Transaction string tag
     */
    private static final String TRANSACTION_TAG = "tag";

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initializeComponents() {
        ButterKnife.bind(this);
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void addFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.constraint_main, UserListFragment.newInstance(), TRANSACTION_TAG);
        transaction.commit();
    }
}
