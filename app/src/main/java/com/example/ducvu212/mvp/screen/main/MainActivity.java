package com.example.ducvu212.mvp.screen.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import butterknife.ButterKnife;
import com.example.ducvu212.mvp.R;
import com.example.ducvu212.mvp.screen.base.BaseActivity;
import com.example.ducvu212.mvp.screen.userdetails.UserDetailsPresenter;
import com.example.ducvu212.mvp.screen.userlist.UserListFragment;

public class MainActivity extends BaseActivity<MainConstract.Presenter>
        implements MainConstract.View {

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initializeComponents() {
        ButterKnife.bind(this);
        getPresenter().addFragment(getSupportFragmentManager());
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

}
