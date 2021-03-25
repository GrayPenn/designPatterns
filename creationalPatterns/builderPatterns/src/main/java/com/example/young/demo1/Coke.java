package com.example.young.demo1;

/**
 * 可口可乐
 *
 * @author pgy
 * @date 2021/3/25 4:10 下午
 **/
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}