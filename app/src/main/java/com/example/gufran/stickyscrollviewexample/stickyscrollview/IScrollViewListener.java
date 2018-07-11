package com.example.gufran.stickyscrollviewexample.stickyscrollview;

public interface IScrollViewListener {
    void onScrollChanged(int l, int t, int oldl, int oldt);
    void onScrollStopped(boolean isStoped);
}
