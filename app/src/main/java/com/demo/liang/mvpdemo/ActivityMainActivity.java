package com.demo.liang.mvpdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityMainActivity extends Activity {


    @Bind(R.id.userName_text)
    TextView userNameText;
    @Bind(R.id.userName_editext)
    EditText userNameEditext;
    @Bind(R.id.userPassword_text)
    TextView userPasswordText;
    @Bind(R.id.userPassword_editext)
    EditText userPasswordEditext;
    @Bind(R.id.login)
    Button login;
    @Bind(R.id.clear)
    Button clear;
    @Bind(R.id.id_pb_loading)
    ProgressBar idPbLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.login)
    public void onClick() {
    }
}
