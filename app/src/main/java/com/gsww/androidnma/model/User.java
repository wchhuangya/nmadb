package com.gsww.androidnma.model;

import android.databinding.ObservableField;

/**
 * 用户实体类
 * Created by wchya on 2016/6/27.
 */
public class User extends BaseModel {
    /** 登录账号 */
    public final ObservableField<String> loginName = new ObservableField<>();
    /** 登录密码 */
    public final ObservableField<String> loginPwd = new ObservableField<>();
    /** 用户姓名 */
    public final ObservableField<String> userName = new ObservableField<>();
}
