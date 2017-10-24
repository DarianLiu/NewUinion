package com.geek.newunion.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;
import com.geek.newunion.mvp.contract.HomeFragmentContract;

import javax.inject.Inject;


@ActivityScope
public class HomeFragmentModel extends BaseModel implements HomeFragmentContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public HomeFragmentModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
        super(repositoryManager);
        this.mGson = gson;
        this.mApplication = application;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

}