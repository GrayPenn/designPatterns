package com.example.young.demo9;

/**
 * 采用延迟加载的线程安全单例
 * @author pgy
 * @date 2021/6/24 9:44 上午
 **/
public class Singleton {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    /**
     * volatile是java语言中的一个关键字，用来修饰java中的变量，主要作用有两个：
     *
     * 1、多线程之间可见性；2、禁止指令重排序。
     *
     * 1、线程可见性
     *
     * jvm的内存模型中，每个线程都有一块单独的内存区域，并且会存储共享变量的副本到线程私有的内存区域中。
     * 这样的情况，使得在多线程的场景下，就会出现各线程中同一变量的值不一致的问题。
     *
     * 比如以下的小demo中，在不加volatile时，A线程和B线程同时操作变量flag时，在A线程执行的过程中，
     * B线程修改了变量值，但是A线程并不知道这个值已经被修改了，还会继续执行while循环。但是flag用volatile修饰后，
     * B线程中修改flag的值为false时，A线程随即结束。
     * 所以  在多线程环境中，被volatile修饰的变量，在某个线程中被修改，在各个线程中可见。
     *
     * 2、禁止指令重排序
     *
     * 我们知道，.class文件会被jvm编译为一些二进制的指令被操作系统识别执行，但是实际执行过程中，线程的执行指令并不一定会按照指令的先后顺序执行，
     * 而是可能发生指令的乱序执行，这样在多线程访问时也会出现一些变量值不一致的问题
     *
     */
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
