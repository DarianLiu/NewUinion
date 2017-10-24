package com.geek.newunion.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.geek.newunion.mvp.contract.OrderFragmentContract;
import com.geek.newunion.mvp.model.OrderFragmentModel;


@Module
public class OrderFragmentModule {
    private OrderFragmentContract.View view;

    /**
     * 构建OrderModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public OrderFragmentModule(OrderFragmentContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    OrderFragmentContract.View provideOrderView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    OrderFragmentContract.Model provideOrderModel(OrderFragmentModel model) {
        return model;
    }
}