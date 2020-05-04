package com.blankj.base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/10/24
 *     desc  : base about activity
 * </pre>
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected View     mContentView;
    protected Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mActivity = this;
        super.onCreate(savedInstanceState);
        setRootLayout(bindLayout());
        initView(savedInstanceState, mContentView);
        doBusiness();
    }

    @SuppressLint("ResourceType")
    public void setRootLayout(@LayoutRes int layoutId) {
        if (layoutId <= 0) return;
        setContentView(mContentView = LayoutInflater.from(this).inflate(layoutId, null));
    }

    public abstract int bindLayout();

    public abstract void initView(@Nullable Bundle savedInstanceState, @Nullable View contentView);

    public abstract void doBusiness();
}

