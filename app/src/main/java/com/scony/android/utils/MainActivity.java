package com.scony.android.utils;

import android.os.Bundle;
import android.util.Log;

import com.scony.android.utils.base.BaseActivity;
import com.scony.utils.library.Date.DateUtils;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String currentTime = DateUtils.getCurrentTime();
        Log.e("MainActivity", currentTime);
    }
}
