package com.yj.njh.base.ui.fmt;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yj.njh.base.ui.kit.UiCallback;

/**
 * baseFmt 父类
 */
public abstract class BaseFmt extends Fragment implements UiCallback {

    protected View rootView;
    protected LayoutInflater layoutInflater;
    protected Activity context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layoutInflater = inflater;

        if (rootView == null) {
            rootView = inflater.inflate(getLayoutId(), null);
        } else {
            ViewGroup viewGroup = (ViewGroup) rootView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(rootView);
            }
        }
        return rootView;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData(savedInstanceState);
        setListener();
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity) {
            this.context = (Activity) context;
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        context = null;
    }
}
