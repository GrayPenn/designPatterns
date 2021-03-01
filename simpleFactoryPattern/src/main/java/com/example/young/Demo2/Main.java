package com.example.young.Demo2;

/**
 * @author pgy
 * @date 2021/3/1 11:01 上午
 **/
public class Main {

    public static void main(String[] args) {
        Product product;
        product = Factory.getProduct("A"); //通过工厂类创建产品对象
        product.methodSame();
        product.methodDiff();

    }


}


