package com.blankj.feature0.pkg.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.blankj.common.CommonTitleActivity;
import com.blankj.feature0.pkg.BusConifg;
import com.blankj.feature0.pkg.R;
import com.blankj.feature1.export.api.Feature1Api;
import com.blankj.feature1.export.bean.Feature1Param;
import com.blankj.feature1.export.bean.Feature1Result;
import com.blankj.utilcode.util.ApiUtils;
import com.blankj.utilcode.util.BusUtils;
import com.blankj.utilcode.util.ToastUtils;


public class Feature0Activity extends CommonTitleActivity {

    @BusUtils.Bus(tag = BusConifg.FEATURE0_SHOW_TOAST)
    public void showToast(String msg) {
        ToastUtils.showLong(msg);
    }

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
        findViewById(R.id.startFeature1Btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Feature1Result result = ApiUtils.getApi(Feature1Api.class)
                        .startFeature1Activity(Feature0Activity.this, new Feature1Param("Feature1Param"));
                ToastUtils.showLong(result.getName());
            }
        });
        BusUtils.register(this);
        findViewById(R.id.showBusToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BusUtils.post(BusConifg.FEATURE0_SHOW_TOAST, "show toast.");
            }
        });
    }

    @Override
    public void doBusiness() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BusUtils.unregister(this);
    }
}
