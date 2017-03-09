package com.demo.liang.mvpdemo.biz;

import com.demo.liang.mvpdemo.bean.User;

/**
 * Created by liang on 2016/12/23.
 */
public interface OnLoginListener {

    void loginSuccess(User user);

    void loginFailed();
}
