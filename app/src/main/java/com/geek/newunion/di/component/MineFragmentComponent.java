package com.geek.newunion.di.component;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;
import com.geek.newunion.di.module.MineFragmentModule;
import com.geek.newunion.mvp.ui.fragment.MineFragment;

@ActivityScope
@Component(modules = MineFragmentModule.class, dependencies = AppComponent.class)
public interface MineFragmentComponent {
    void inject(MineFragment fragment);
}