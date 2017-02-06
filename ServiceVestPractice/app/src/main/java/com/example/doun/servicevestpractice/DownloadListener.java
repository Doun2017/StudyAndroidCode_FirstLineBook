package com.example.doun.servicevestpractice;

/**
 * Created by Doun on 2017/1/22.
 */

public interface DownloadListener {
    void onProgerss(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
