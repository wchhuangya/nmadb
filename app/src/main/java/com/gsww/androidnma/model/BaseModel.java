package com.gsww.androidnma.model;

import android.databinding.ObservableBoolean;

/**
 * Model的基类
 * Created by wchya on 2016/6/1.
 */
public class BaseModel {
    /** 标识网络是否连接的变量。true-已连接；false-未连接； */
    public final ObservableBoolean isNetConnected = new ObservableBoolean(true);
}
