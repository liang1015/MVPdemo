package com.demo.liang.mvpdemo.presenter;

import com.demo.liang.mvpdemo.contract.UserLoginContract;

/**
 * Created by liang on 2017/3/8.
 */
public class LoginPresenter extends UserLoginContract.Presenter{

    @Override
    public void checkLogin(String name, String password) {

        mView.checkLogin(mModel.checkLogin(name,password));
    }
}
