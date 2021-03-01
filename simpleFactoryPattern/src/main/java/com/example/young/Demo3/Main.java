package com.example.young.Demo3;

/**
 * @author pgy
 * @date 2021/3/1 11:07 上午
 **/
public class Main {

    public static void main(String args[]) {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品
        chart.display();
    }
}