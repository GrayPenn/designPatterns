package com.example.young.volatileDemo;

import java.util.concurrent.TimeUnit;

/**
 * @author pgy
 * @date 2021/6/24 9:52 上午
 **/
public class demo {
    private static boolean flag = true;

    public static void main(String[] args) {
        Thread A = new Thread(() -> {
            while (flag) {
                System.out.println("11111111111");
            }
        });
        Thread B = new Thread(() -> {
            try {
                System.out.println("222222222222");
                TimeUnit.SECONDS.sleep(2);
                flag = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        A.start();
        B.start();
    }
}
