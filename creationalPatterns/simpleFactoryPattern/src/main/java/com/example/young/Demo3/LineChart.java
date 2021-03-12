package com.example.young.Demo3;

/**
 * @author pgy
 * @date 2021/3/1 11:06 上午
 **/
//折线图类：具体产品类
class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}