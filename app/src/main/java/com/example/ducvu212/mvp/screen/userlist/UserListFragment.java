package com.example.ducvu212.mvp.screen.userlist;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.ducvu212.mvp.R;
import com.example.ducvu212.mvp.Utils.DisplayUtils;
import com.example.ducvu212.mvp.data.model.User;
import com.example.ducvu212.mvp.screen.base.BaseFragment;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserListFragment extends BaseFragment<UserListContract.Presenter>
        implements UserListContract.View, SearchView.OnQueryTextListener {

    @BindView(R.id.recycle_user)
    RecyclerView mRecyclerViewUser;

    @BindView(R.id.search_view)
    SearchView mSearchView;

    private List<User> mListUsers;
    private UserListAdapter mUserListAdapter;

    public UserListFragment() {
        // Required empty public constructor
    }

    public static UserListFragment newInstance() {
        return new UserListFragment();
    }

    @Override
    public int getContentViewId() {
        return R.layout.fragment_user_list;
    }

    @Override
    public void initializeComponents(View view) {
        ButterKnife.bind(this, view);
        mListUsers = new ArrayList<>();
        initSearchView();
    }

    private void initSearchView() {
        SearchView.SearchAutoComplete searchAutoComplete =
                mSearchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        mSearchView.setIconified(false);
        mSearchView.setIconifiedByDefault(false);
        searchAutoComplete.setHintTextColor(getResources().getColor(R.color.hint_text_color));
        searchAutoComplete.setTextColor(getResources().getColor(R.color.text_search_color));
        mSearchView.setOnQueryTextListener(this);
    }

    @Override
    public UserListPresenter createPresenter() {
        return new UserListPresenter(this);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        if (!s.isEmpty()) {
            getPresenter().searchUser(s);
        }
        return false;
    }

    @Override
    public void Success(List<User> users) {
        DisplayUtils.makeText(getContext(), getResources().getString(R.string.onSuccess));
        setupRecycleview(users);
    }

    private void setupRecycleview(List<User> users) {
        if (mListUsers != null && mUserListAdapter != null) {
            mListUsers.clear();
            mListUsers.addAll(users);
            mUserListAdapter.notifyDataSetChanged();
        } else {
            mListUsers = users;
            mUserListAdapter = new UserListAdapter(mListUsers);
            mRecyclerViewUser.setLayoutManager(new LinearLayoutManager(getContext()));
            mRecyclerViewUser.setAdapter(mUserListAdapter);
        }
    }

    @Override
    public void NetworkError() {
        DisplayUtils.makeText(getContext(), getResources().getString(R.string.onNetworkError));
    }

    @Override
    public void Error() {
        DisplayUtils.makeText(getContext(), getResources().getString(R.string.onEror));
    }
}
