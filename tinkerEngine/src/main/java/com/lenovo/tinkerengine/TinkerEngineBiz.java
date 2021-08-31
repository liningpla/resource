package com.lenovo.tinkerengine;

import android.content.Context;
import android.util.Log;

public enum TinkerEngineBiz {
    INIT;

    public static final String TAG = "TinkerEngine";

    public void initTinker(Context context){

        Log.i(TAG, "-------initTinker-------");
    }
}
