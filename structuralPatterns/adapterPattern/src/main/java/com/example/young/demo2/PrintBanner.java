package com.example.young.demo2;

/**
 * @author pgy
 * @date 2021/12/30 5:01 下午
 **/
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

}
