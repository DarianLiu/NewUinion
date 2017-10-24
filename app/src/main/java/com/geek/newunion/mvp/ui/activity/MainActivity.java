package com.geek.newunion.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.geek.newunion.R;
import com.geek.newunion.di.component.DaggerMainComponent;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.geek.newunion.mvp.contract.MainContract;
import com.geek.newunion.mvp.ui.fragment.MineFragment;
import com.geek.newunion.mvp.ui.fragment.OrderFragment;

import com.geek.newunion.di.module.MainModule;
import com.geek.newunion.mvp.presenter.MainPresenter;

import static com.jess.arms.utils.Preconditions.checkNotNull;

import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import butterknife.BindView;

import com.geek.newunion.mvp.ui.fragment.HomeFragment;
import com.geek.newunion.mvp.ui.fragment.MarketFragment;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @BindView(android.R.id.tabhost)
    FragmentTabHost tabhost;
    @BindView(android.R.id.tabcontent)
    FrameLayout tabcontent;
    @BindView(android.R.id.tabs)
    TabWidget tabs;

    //图标
    private int mImages[] = {R.drawable.tab_home_selector, R.drawable.tab_market_selector, R.drawable.tab_order_selector, R.drawable.tab_mine_selector};
    //标题
    private String titles[] = {"首页", "行情", "订单", "我的"};
    //定义数组来存放Fragment界面
    private Class fragments[] = {HomeFragment.class, MarketFragment.class, OrderFragment.class, MineFragment.class};

    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(Bundle savedInstanceState) {
        return R.layout.activity_main; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        tabhost.setup(MainActivity.this, getSupportFragmentManager(), android.R.id.tabcontent);
        tabhost.getTabWidget().setDividerDrawable(null); // 去掉分割线

        for (int i = 0; i < titles.length; i++) {
            TabHost.TabSpec tabSpec = tabhost.newTabSpec(titles[i]).setIndicator(getTabView(i));
            tabhost.addTab(tabSpec, fragments[i], null);
            //设置Tab按钮的背景
            tabhost.getTabWidget().getChildAt(i).setBackgroundResource(R.color.white);

            View view = tabhost.getTabWidget().getChildAt(i);
            view.setId(i);
            view.setOnClickListener(v -> {
                setCurrentTab(v.getId());
                switch (v.getId()) {
                    case 0:
//                        titleBar.getTitleBarTitle().setText(titles[0]);
//                        titleBar.getTitleBarRightBtn().setVisibility(View.VISIBLE);
                        break;
                    case 1:
//                        titleBar.getTitleBarTitle().setText(titles[1]);
//                        titleBar.getTitleBarRightBtn().setVisibility(View.VISIBLE);
                        break;
                    case 2:
//                        titleBar.getTitleBarTitle().setText(titles[2]);
//                        titleBar.getTitleBarRightBtn().setVisibility(View.VISIBLE);
                        break;
                    case 3:
//                        titleBar.getTitleBarTitle().setText(titles[3]);
//                        titleBar.getTitleBarRightBtn().setVisibility(View.GONE);
                        break;
                }
            });
        }
    }

    /**
     * 设置当前的Tab
     */
    public void setCurrentTab(int index) {
        tabhost.setCurrentTab(index);
    }

    /**
     * 获取当前tab视图
     */
    private View getTabView(int index) {
        View view = getLayoutInflater().inflate(R.layout.view_tab, null);
        ImageView imageView = view.findViewById(R.id.tab_iv);
        TextView textView = view.findViewById(R.id.tab_tv);
        imageView.setImageResource(mImages[index]);
        textView.setText(titles[index]);
        return view;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }


}
