package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/5/27 5:03 下午
 **/
public class FlyweightPatternDemo {
    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        double index = Math.random() * colors.length;
        //0.0 =< X < 1.0。
        //0.0 =< X < 1.0*length。
        //System.out.println(index);
        return colors[(int) index];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
