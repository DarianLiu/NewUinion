package com.geek.newunion.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.geek.newunion.mvp.contract.MineFragmentContract;
import com.geek.newunion.mvp.model.MineFragmentModel;


@Module
public class MineFragmentModule {
    private MineFragmentContract.View view;

    /**
     * 构建MineFragmentModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MineFragmentModule(MineFragmentContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MineFragmentContract.View provideMineFragmentView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MineFragmentContract.Model provideMineFragmentModel(MineFragmentModel model) {
        return model;
    }
}