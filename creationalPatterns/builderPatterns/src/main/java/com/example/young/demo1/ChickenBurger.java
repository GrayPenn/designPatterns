package com.example.young.demo1;

/**
 * 鸡肉汉堡
 *
 * @author pgy
 * @date 2021/3/25 4:09 下午
 **/
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}