package com.geek.newunion.di.component;

import com.geek.newunion.di.module.OrderFragmentModule;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;
import com.geek.newunion.mvp.ui.fragment.OrderFragment;

@ActivityScope
@Component(modules = OrderFragmentModule.class, dependencies = AppComponent.class)
public interface OrderFragmentComponent {
    void inject(OrderFragment fragment);
}