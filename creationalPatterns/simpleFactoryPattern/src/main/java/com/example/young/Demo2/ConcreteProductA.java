package com.example.young.Demo2;

/**
 * @author pgy
 * @date 2021/3/1 11:00 上午
 **/
class ConcreteProductA extends Product {

    //实现业务方法
    @Override
    public void methodDiff() {
        //业务方法的实现
        System.out.println("这边是产品 A 的输出");
    }
}