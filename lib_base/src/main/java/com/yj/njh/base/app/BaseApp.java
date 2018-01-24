package com.yj.njh.base.app;

import android.app.Application;
import android.content.Context;

import com.yj.njh.base.context.MyContextWrapper;

/**
 * Created by niejiahuan on 18/1/24.
 */

public class BaseApp extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    public  void setContext(Context context) {
        BaseApp.context = context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setContext(this);
    }

    //只是最近 context.getResources()。已弃用updateConfiguration() Android API 25 和它建议使用 context .createConfigurationContext()相反。
//    @Override
//    public Resources getResources() {
//        Resources res = super.getResources();
//        Configuration config=new Configuration();
//        config.setToDefaults();
//        res.updateConfiguration(config,res.getDisplayMetrics() );
//        return res;
//    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(MyContextWrapper.wrap(base,""));
    }
}
