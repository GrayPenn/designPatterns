package com.example.young.Demo4;

import com.example.young.Demo3.Chart;
import com.example.young.Demo3.ChartFactory;

/**
 * @author pgy
 * @date 2021/3/1 11:14 上午
 **/
public class SimpleFactoryPatternDemo3Main {
    public static void main(String[] args) {
        Chart chart;
        String type = XMLUtil.getChartType(); //读取配置文件中的参数
        chart = ChartFactory.getChart(type); //创建产品对象
        chart.display();

    }
}
