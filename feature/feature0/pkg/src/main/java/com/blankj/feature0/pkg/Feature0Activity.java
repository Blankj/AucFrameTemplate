package com.blankj.feature0.pkg;

import android.os.Bundle;
import android.view.View;

import com.blankj.common.CommonTitleActivity;

import androidx.annotation.Nullable;


public class Feature0Activity extends CommonTitleActivity {

    @Override
    public CharSequence bindTitle() {
        return getString(R.string.feature0_title);
    }

    @Override
    public boolean isSwipeBack() {
        return false;
    }

    @Override
    public int bindLayout() {
        return R.layout.feature0_activity;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState, @Nullable View contentView) {

    }

    @Override
    public void doBusiness() {

    }
}
