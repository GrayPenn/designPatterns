package com.example.young.Demo2;

/**
 * @author pgy
 * @date 2021/3/1 11:01 上午
 **/
class Factory {
    //静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if ("A".equalsIgnoreCase(arg)) {
            product = new ConcreteProductA();
            //初始化设置product
        } else if ("B".equalsIgnoreCase(arg)) {
            product = new ConcreteProductB();
            //初始化设置product
        }
        return product;
    }
}
