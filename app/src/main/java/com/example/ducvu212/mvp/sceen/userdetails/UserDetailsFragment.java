package com.example.ducvu212.mvp.sceen.userdetails;

import android.support.v4.app.Fragment;
import android.view.View;
import com.example.ducvu212.mvp.R;
import com.example.ducvu212.mvp.sceen.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserDetailsFragment extends BaseFragment<UserDetailsContract.Presenter>
        implements UserDetailsContract.View {

    public UserDetailsFragment() {
        // Required empty public constructor
    }

    public static UserDetailsFragment newInstance() {
        UserDetailsFragment fragment = new UserDetailsFragment();
        return fragment;
    }

    @Override
    public int getContentViewId() {
        return R.layout.fragment_user_details;
    }

    @Override
    public void initializeComponents(View view) {

    }

    @Override
    public UserDetailsPresenter createPresenter() {
        return new UserDetailsPresenter(this);
    }
}
