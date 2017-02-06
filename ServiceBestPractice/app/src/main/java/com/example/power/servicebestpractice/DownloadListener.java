package com.example.power.servicebestpractice;

/**
 * Created by power on 2017/1/23.
 */

public interface DownloadListener {
    void onProgerss(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
