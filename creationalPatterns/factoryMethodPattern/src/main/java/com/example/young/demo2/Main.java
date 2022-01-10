package com.example.young.demo2;

/**
 * @author pgy
 * @date 2022/1/10 7:45 下午
 **/
public class Main {

    public static void main(String[] args) {

        Factory factory = new IDCardFactory();

        Product card1 = factory.create("小明");

        Product card2 = factory.create("小红");

        card1.use();

        card2.use();

    }

}
