package com.gsww.androidnma.model;

import android.databinding.ObservableBoolean;

/**
 * 登录页面用到的数据
 * Created by wchya on 2016/6/2.
 */
public class Login extends BaseModel {
    /** 是否显示引导页面 */
    public final ObservableBoolean isShowGuide = new ObservableBoolean(false);
    /** 是否显示单位信息的启动页面 */
    public final ObservableBoolean isShowUnitStart = new ObservableBoolean(false);
}
