package com.demo.liang.mvpdemo.biz;

/**
 * Created by liang on 2016/12/23.
 */
public interface IUserBiz {
    public void login(String username, String password, OnLoginListener loginListener);
}
