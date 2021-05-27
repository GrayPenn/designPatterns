package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/5/10 5:28 下午
 **/
public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}