package com.gsww.androidnma.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.gsww.androidnma.activity.databinding.LoginBinding;
import com.gsww.androidnma.model.Login;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginBinding binding = DataBindingUtil.setContentView(this, R.layout.login);
        Login login = new Login();
        login.isNetConnected.set(true);
        login.isShowGuide.set(true);
        binding.setLogin(login);
    }
}
