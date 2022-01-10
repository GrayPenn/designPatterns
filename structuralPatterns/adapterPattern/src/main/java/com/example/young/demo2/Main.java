package com.example.young.demo2;

/**
 * 适配器模式
 *
 * 对 main 类而言
 * Banner 类、showWithParen 方法、showWithAster 方法都被完全隐藏起来了
 *
 * @author pgy
 * @date 2021/12/30 5:09 下午
 **/
public class Main {

    public static void main(String[] args) {

        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();





    }
}
