package com.example.young.demo1;

/**
 * 矩形
 *
 * @author pgy
 * @date 2021/3/25 2:49 下午
 **/
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}