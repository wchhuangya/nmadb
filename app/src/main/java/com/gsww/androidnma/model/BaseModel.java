package com.gsww.androidnma.model;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

/**
 * Model的基类
 * Created by wchya on 2016/6/1.
 */
public class BaseModel {
    /** 标识网络是否连接的变量。true-已连接；false-未连接； */
    public final ObservableBoolean isNetConnected = new ObservableBoolean(true);
    /** 分支标识：JT-集团；GD-广东；SX-山西旅游局；SXGQT-山西共青团；TB-汤伯；WHGJ-芜湖公交；(WYFWXT-物业服务系统；SDYC-山东烟草；)ZST-掌税通；SGF-省高法 */
    public final ObservableField<String> mBranchSign = new ObservableField<>();
}
