package com.geek.newunion.di.component;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.geek.newunion.mvp.ui.fragment.HomeFragment;

@ActivityScope
@Component(modules = com.geek.newunion.di.module.HomeFragmentModule.class, dependencies = AppComponent.class)
public interface HomeFragmentComponent {
    void inject(HomeFragment fragment);
}