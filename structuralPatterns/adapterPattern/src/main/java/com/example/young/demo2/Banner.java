package com.example.young.demo2;

/**
 * @author pgy
 * @date 2021/12/30 5:01 下午
 **/
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }

}
