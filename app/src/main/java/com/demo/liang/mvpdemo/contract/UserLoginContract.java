package com.demo.liang.mvpdemo.contract;

import com.demo.liang.mvpdemo.base.BaseModel;
import com.demo.liang.mvpdemo.base.BasePresenter;
import com.demo.liang.mvpdemo.base.BaseView;

/**
 * Created by liang on 2017/3/8.
 */
public interface UserLoginContract {

    interface Model extends BaseModel{
        boolean checkLogin(String name, String password);
    }

    interface View extends BaseView{
        void checkLogin(boolean isLogin);
    }

    abstract class Presenter extends BasePresenter<View , Model>{
        public abstract void checkLogin(String name, String password);
    }
}
