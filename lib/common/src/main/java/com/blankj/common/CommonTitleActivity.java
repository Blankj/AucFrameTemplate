package com.blankj.common;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.ColorUtils;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;


public abstract class CommonTitleActivity extends CommonBackActivity {

    public abstract CharSequence bindTitle();

    protected CoordinatorLayout commonTitleRootLayout;
    protected Toolbar           commonTitleToolbar;
    protected FrameLayout       commonTitleContentView;

    @Override
    public boolean isSwipeBack() {
        return true;
    }

    @SuppressLint("ResourceType")
    @Override
    public void setRootLayout(@LayoutRes int layoutId) {
        super.setRootLayout(R.layout.common_activity_title);
        commonTitleRootLayout = findViewById(R.id.commonTitleRootLayout);
        commonTitleToolbar = findViewById(R.id.commonTitleToolbar);
        if (layoutId > 0) {
            commonTitleContentView = findViewById(R.id.commonTitleContentView);
            LayoutInflater.from(this).inflate(layoutId, commonTitleContentView);
        }
        setTitleBar();
        BarUtils.setStatusBarColor(this, ColorUtils.getColor(R.color.colorPrimary));
        BarUtils.addMarginTopEqualStatusBarHeight(commonTitleRootLayout);
    }

    private void setTitleBar() {
        setSupportActionBar(commonTitleToolbar);
        ActionBar titleBar = getSupportActionBar();
        if (titleBar != null) {
            titleBar.setDisplayHomeAsUpEnabled(true);
            titleBar.setTitle(bindTitle());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
