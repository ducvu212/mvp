package com.example.ducvu212.mvp.screen.userlist;

import android.annotation.SuppressLint;
import com.example.ducvu212.mvp.data.model.User;
import com.example.ducvu212.mvp.data.repository.UserRepository;
import com.example.ducvu212.mvp.data.source.UserDataSource;
import com.example.ducvu212.mvp.data.source.remote.UserRemoteDataSource;
import com.example.ducvu212.mvp.screen.base.BasePresenterImp;
import java.util.List;

import static android.support.v4.util.Preconditions.checkNotNull;

/**
 * Created by CuD HniM on 18/08/06.
 */
public class UserListPresenter extends BasePresenterImp<UserListContract.View>
        implements UserListContract.Presenter {

    private UserRepository mRepository;
    private UserListContract.View mView;

    @SuppressLint("RestrictedApi")
    public UserListPresenter(UserListContract.View view) {
        super(view);
        mRepository = UserRepository.getmInstance(UserRemoteDataSource.getInstance());
        mView = checkNotNull(view);
    }

    @Override
    public void searchUser(String text) {
        mRepository.getUsers(text, 100, new UserDataSource.onNetworkChange() {
            @Override
            public boolean onSuccess(List<User> users) {
                mView.Success(users);
                return false;
            }

            @Override
            public boolean onError() {
                mView.Error();
                return false;
            }

            @Override
            public boolean onNetWorkError() {
                mView.NetworkError();
                return false;
            }
        });
    }
}
