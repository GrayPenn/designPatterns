package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/3/12 2:05 下午
 **/
public class FacadePatternDemo1Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
