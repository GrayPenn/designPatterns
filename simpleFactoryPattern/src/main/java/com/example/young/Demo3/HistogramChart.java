package com.example.young.Demo3;

/**
 * @author pgy
 * @date 2021/3/1 11:06 上午
 **/
//柱状图类：具体产品类
class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}