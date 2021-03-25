package com.example.young.demo1;

/**
 * 组合套餐
 *
 * @author pgy
 * @date 2021/3/25 4:08 下午
 **/
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}