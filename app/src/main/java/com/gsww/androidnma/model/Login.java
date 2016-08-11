package com.gsww.androidnma.model;

import android.Manifest;
import android.content.pm.PackageManager;
import android.databinding.ObservableBoolean;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Toast;

/**
 * 登录页面用到的数据
 * Created by wchya on 2016/6/2.
 */
public class Login extends BaseModel {
    /** 是否显示默认启动页面 */
    public final ObservableBoolean isShowStart = new ObservableBoolean(true);
    /** 是否显示单位信息的启动页面 */
    public final ObservableBoolean isShowUnitStart = new ObservableBoolean(false);
    /** 是否显示引导页面 */
    public final ObservableBoolean isShowGuide = new ObservableBoolean(false);
    /** 是否显示节日祝福页面 */
    public final ObservableBoolean isShowFestival = new ObservableBoolean(false);
    /** 是否有自定义背景 */
    public final ObservableBoolean isCustomBg = new ObservableBoolean(false);
    /** 是否有自定义Logo */
    public final ObservableBoolean isCustomLogo = new ObservableBoolean(false);
    /** 是否显示清除登录账号的按钮 */
    public final ObservableBoolean isShowClearLoginName = new ObservableBoolean(false);
    /** 是否显示更多登录账号的按钮 */
    public final ObservableBoolean isShowMoreLoginName = new ObservableBoolean(false);
    /** 是否显示清除登录密码的按钮 */
    public final ObservableBoolean isShowClearLoginPwd = new ObservableBoolean(false);

    public void readContacts(View view) {
        if (PackageManager.PERMISSION_GRANTED == ContextCompat.checkSelfPermission(view.getContext(), Manifest.permission.READ_CONTACTS)) {
            Toast.makeText(view.getContext(), "有权限", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(view.getContext(), "无权限", Toast.LENGTH_LONG).show();
        }
    }
}
