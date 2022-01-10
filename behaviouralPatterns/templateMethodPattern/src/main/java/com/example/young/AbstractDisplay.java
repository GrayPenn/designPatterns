package com.example.young;

/**
 * 抽象类 AbstractDisplay
 * @author pgy
 * @date 2022/1/7 2:19 下午
 **/
public abstract class AbstractDisplay {

    /**
     * 交给子类去实现的抽象方法
     */
    public abstract void open();

    /**
     * 交给子类去实现的抽象方法
     */
    public abstract void print();

    /**
     * 交给子类去实现的抽象方法
     */
    public abstract void close();

    /**
     * 本抽象类中实现的 display 方法
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }


}
