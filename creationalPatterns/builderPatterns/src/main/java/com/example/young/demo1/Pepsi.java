package com.example.young.demo1;

/**
 * 百事可乐
 *
 * @author pgy
 * @date 2021/3/25 4:10 下午
 **/
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}