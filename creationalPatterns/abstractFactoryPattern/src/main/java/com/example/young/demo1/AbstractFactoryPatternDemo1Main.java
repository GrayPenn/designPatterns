package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/3/11 10:50 上午
 **/
public class AbstractFactoryPatternDemo1Main {
    public static void main(String args[]) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory) XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
