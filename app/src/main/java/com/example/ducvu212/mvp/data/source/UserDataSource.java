package com.example.ducvu212.mvp.data.source;

/**
 * Created by CuD HniM on 18/08/06.
 */
public abstract class UserDataSource {

    /**
     * Remote data source
     */

    protected interface onNetworkChange {
        boolean onSuccess();

        boolean onError();

        boolean onNetWorkError();
    }

    public abstract void getDataFromGithub(String name, int limit, onNetworkChange onNetworkChange);
}
