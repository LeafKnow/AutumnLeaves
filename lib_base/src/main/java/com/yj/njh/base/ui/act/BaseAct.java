package com.yj.njh.base.ui.act;

import android.content.Intent;
import android.os.Bundle;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.yj.njh.base.ui.kit.UiCallback;

/**
 * act父类
 */
public abstract class BaseAct extends RxAppCompatActivity implements UiCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLayoutId()!=0) {
            setContentView(getLayoutId());
            initData(savedInstanceState);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
