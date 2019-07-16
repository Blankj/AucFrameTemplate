package com.blankj.feature1.pkg;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.blankj.common.CommonTitleActivity;


public class Feature1Activity extends CommonTitleActivity {

    @Override
    public CharSequence bindTitle() {
        return getString(R.string.feature1_title);
    }

    @Override
    public boolean isSwipeBack() {
        return true;
    }

    @Override
    public int bindLayout() {
        return R.layout.feature1_activity;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState, @Nullable View contentView) {

    }

    @Override
    public void doBusiness() {

    }
}
