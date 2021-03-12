package com.example.young.Demo2;

/**
 * @author pgy
 * @date 2021/3/1 11:00 上午
 **/
abstract class Product {
    //所有产品类的公共业务方法
    public void methodSame() {
        //公共方法的实现
        System.out.println("公共方法，例：初始化库存");
    }

    //声明抽象业务方法
    public abstract void methodDiff();
}