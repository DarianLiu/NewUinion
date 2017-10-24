package com.geek.newunion.di.module;

import com.jess.arms.di.scope.ActivityScope;
import com.geek.newunion.mvp.contract.HomeFragmentContract;

import dagger.Module;
import dagger.Provides;

import com.geek.newunion.mvp.model.HomeFragmentModel;


@Module
public class HomeFragmentModule {
    private HomeFragmentContract.View view;

    /**
     * 构建HomeModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public HomeFragmentModule(HomeFragmentContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    HomeFragmentContract.View provideHomeView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    HomeFragmentContract.Model provideHomeModel(HomeFragmentModel model) {
        return model;
    }
}