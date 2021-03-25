package com.example.young.demo1;

/**
 * 蔬菜汉堡
 *
 * @author pgy
 * @date 2021/3/25 4:09 下午
 **/
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}