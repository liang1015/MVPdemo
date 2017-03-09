package com.demo.liang.mvpdemo.model;

import com.demo.liang.mvpdemo.contract.UserLoginContract;

/**
 * Created by liang on 2017/3/8.
 */
public class LoginModel implements UserLoginContract.Model {

    @Override
    public boolean checkLogin(String name, String password) {
        if ("liang".equals(name) && "123456".equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
