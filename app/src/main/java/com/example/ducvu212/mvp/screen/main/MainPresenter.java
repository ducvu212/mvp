package com.example.ducvu212.mvp.screen.main;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.example.ducvu212.mvp.R;
import com.example.ducvu212.mvp.screen.base.BasePresenterImp;
import com.example.ducvu212.mvp.screen.userlist.UserListFragment;

/**
 * Created by CuD HniM on 18/08/06.
 */
public class MainPresenter extends BasePresenterImp<MainConstract.View>
        implements MainConstract.Presenter {

    private static final String TRANSACTION_TAG = "TAG";

    public MainPresenter(MainConstract.View view) {
        super(view);
    }

    @Override
    public void addFragment(FragmentManager manager) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_main_layout, UserListFragment.newInstance(), TRANSACTION_TAG);
        transaction.commit();
    }
}
