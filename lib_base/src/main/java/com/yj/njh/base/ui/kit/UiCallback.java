package com.yj.njh.base.ui.kit;

import android.os.Bundle;

/**
 * Created by niejiahuan on 18/1/24.
 */

public interface UiCallback {
    void initData(Bundle savedInstanceState);

    void setListener();

    int getLayoutId();
}
