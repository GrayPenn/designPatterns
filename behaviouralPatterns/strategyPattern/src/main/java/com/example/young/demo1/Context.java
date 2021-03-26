package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/3/26 10:31 上午
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}