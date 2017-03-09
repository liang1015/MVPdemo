package com.demo.liang.mvpdemo.base;

import android.content.Context;

/**
 * Created by liang on 2017/3/8.
 */
public abstract class BasePresenter<T, E> {
    public Context mContext;
    public T mView;
    public E mModel;

    public void setVM(T v, E m){
        this.mView = v;
        this.mModel = m;
    }
   public void onDestroy(){

   }
}
