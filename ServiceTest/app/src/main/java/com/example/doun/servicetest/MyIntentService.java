package com.example.doun.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.content.IntentSender;
import android.util.Log;

/**
 * Created by Doun on 2017/1/19.
 */

public class MyIntentService extends IntentService {
    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("MyIntentService", "Thread id is"+Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("MyIntentService", "onDestroy 执行");
    }
}
