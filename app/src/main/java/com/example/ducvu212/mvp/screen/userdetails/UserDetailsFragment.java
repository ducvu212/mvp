package com.example.ducvu212.mvp.screen.userdetails;

import android.support.v4.app.Fragment;
import android.view.View;
import butterknife.ButterKnife;
import com.example.ducvu212.mvp.R;
import com.example.ducvu212.mvp.screen.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserDetailsFragment extends BaseFragment<UserDetailsContract.Presenter>
        implements UserDetailsContract.View {

    public UserDetailsFragment() {
        // Required empty public constructor
    }

    public static UserDetailsFragment newInstance() {
        return new UserDetailsFragment();
    }

    @Override
    public int getContentViewId() {
        return R.layout.fragment_user_details;
    }

    @Override
    public void initializeComponents(View view) {
        ButterKnife.bind(this, view);
    }

    @Override
    public UserDetailsPresenter createPresenter() {
        return new UserDetailsPresenter(this);
    }
}
