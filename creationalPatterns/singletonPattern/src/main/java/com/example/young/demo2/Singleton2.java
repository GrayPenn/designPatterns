package com.example.young.demo2;

/**
 * 线程不安全，会产生多个实例，不可用。
 *
 * @author pgy
 * @date 2021/3/12 3:41 下午
 **/
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                singleton2 = new Singleton2();
            }
        }
        return singleton2;
    }

}