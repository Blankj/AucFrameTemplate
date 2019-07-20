package com.blankj.mock.feature1;

import android.content.Context;

import com.blankj.feature1.export.api.Feature1Api;
import com.blankj.feature1.export.bean.Feature1Param;
import com.blankj.feature1.export.bean.Feature1Result;
import com.blankj.utilcode.util.ApiUtils;


@ApiUtils.Api(isMock = true)
public class Feature1ApiMock extends Feature1Api {
    @Override
    public Feature1Result startFeature1Activity(Context context, Feature1Param param) {
        return new Feature1Result("Mock Result");
    }
}
