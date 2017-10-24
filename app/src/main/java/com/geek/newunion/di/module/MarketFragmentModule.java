package com.geek.newunion.di.module;

import com.jess.arms.di.scope.ActivityScope;
import com.geek.newunion.mvp.contract.MarketFragmentContract;
import com.geek.newunion.mvp.model.MarketFragmentModel;

import dagger.Module;
import dagger.Provides;


@Module
public class MarketFragmentModule {
    private MarketFragmentContract.View view;

    /**
     * 构建MarketModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MarketFragmentModule(MarketFragmentContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MarketFragmentContract.View provideMarketView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MarketFragmentContract.Model provideMarketModel(MarketFragmentModel model) {
        return model;
    }
}