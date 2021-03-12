package com.example.young.Demo3;

/**
 * @author pgy
 * @date 2021/3/1 11:06 上午
 **/
//饼状图类：具体产品类
class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}
