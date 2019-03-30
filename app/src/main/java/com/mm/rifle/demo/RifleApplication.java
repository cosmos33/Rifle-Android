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

        Rifle.init(this, "e2670a2e4b44b76adc262e51fc22b8d2", BuildConfig.DEBUG);

    }
}
