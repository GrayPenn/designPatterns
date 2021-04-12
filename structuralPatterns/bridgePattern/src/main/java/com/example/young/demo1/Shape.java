package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/4/12 3:45 下午
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}