package com.example.sharepreferencesample;

import android.app.Application;
import android.content.Context;

/**
 * Created by admin on 2018/1/15.
 */

public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getmContext() {
        return mContext;
    }
}
