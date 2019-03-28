package com.mm.rifle.demo;

import android.app.Application;

import com.mm.rifle.Rifle;

/**
 * Created by chenwangwang on 2019-03-22.
 */
public class RifleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Rifle.init(this, "后台申请的APPID", BuildConfig.DEBUG);

    }
}
