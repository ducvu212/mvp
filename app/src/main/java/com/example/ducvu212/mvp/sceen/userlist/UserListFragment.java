package com.example.ducvu212.mvp.sceen.userlist;

import android.support.v4.app.Fragment;
import android.view.View;
import com.example.ducvu212.mvp.R;
import com.example.ducvu212.mvp.sceen.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserListFragment extends BaseFragment<UserListContract.Presenter> implements
        UserListContract.View {

    public UserListFragment() {
        // Required empty public constructor
    }

    public static UserListFragment newInstance() {
        UserListFragment fragment = new UserListFragment();
        return fragment;
    }

    @Override
    public int getContentViewId() {
        return R.layout.fragment_user_list;
    }

    @Override
    public void initializeComponents(View view) {

    }

    @Override
    public UserListContract.Presenter createPresenter() {
        return null;
    }
}
