package com.demo.liang.mvpdemo;

import android.widget.Toast;

import com.demo.liang.mvpdemo.base.BaseActivity;
import com.demo.liang.mvpdemo.contract.UserLoginContract;
import com.demo.liang.mvpdemo.model.LoginModel;
import com.demo.liang.mvpdemo.presenter.LoginPresenter;

/**
 * Created by liang on 2017/3/8.
 */
public class LogInActivity extends BaseActivity<LoginPresenter, LoginModel> implements UserLoginContract.View{

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    public void initView() {
        mPresenter.checkLogin("liang", "123456");
    }

    @Override
    public void checkLogin(boolean isLogin) {
        Toast.makeText(this,
                "login succeed", Toast.LENGTH_SHORT).show();
    }
}
