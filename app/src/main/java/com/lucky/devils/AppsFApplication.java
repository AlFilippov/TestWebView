package com.lucky.devils;

import android.app.Application;

import com.appsflyer.AppsFlyerLib;

public class AppsFApplication extends Application {
    private static final String AF_DEV_KEY = "cA474CM8ePANnoSNzfZP6A";

    @Override
    public void onCreate() {
        super.onCreate();
        AppsFlyerLib.getInstance().startTracking(this, AF_DEV_KEY);
    }
}

