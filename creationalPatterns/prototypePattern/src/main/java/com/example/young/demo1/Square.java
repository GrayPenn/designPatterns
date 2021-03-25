package com.example.young.demo1;

/**
 * 正方形
 *
 * @author pgy
 * @date 2021/3/25 2:50 下午
 **/
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}