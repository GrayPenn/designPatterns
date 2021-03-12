package com.example.young.Demo2;

/**
 * @author pgy
 * @date 2021/3/12 10:11 上午
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}