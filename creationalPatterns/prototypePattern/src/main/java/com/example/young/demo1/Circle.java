package com.example.young.demo1;

/**
 * 圆
 *
 * @author pgy
 * @date 2021/3/25 2:50 下午
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}