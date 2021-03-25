package com.example.young.demo1;

/**
 * 汉堡抽象类
 *
 * @author pgy
 * @date 2021/3/25 4:09 下午
 **/
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}