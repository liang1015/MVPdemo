package com.demo.liang.mvpdemo.view;

import com.demo.liang.mvpdemo.bean.User;

/**
 * Created by liang on 2016/12/23.
 */
public interface IUserLoginView {
    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
