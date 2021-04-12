package com.example.young.demo2;

/**
 * @author pgy
 * @date 2021/4/12 4:04 下午
 **/
public abstract class Abstraction {
    protected Implementor imple;
    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }
    public abstract void Operation();
}
