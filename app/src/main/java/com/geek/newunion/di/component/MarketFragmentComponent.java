package com.geek.newunion.di.component;

import com.geek.newunion.di.module.MarketFragmentModule;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.geek.newunion.mvp.ui.fragment.MarketFragment;

@ActivityScope
@Component(modules = MarketFragmentModule.class, dependencies = AppComponent.class)
public interface MarketFragmentComponent {
    void inject(MarketFragment fragment);
}