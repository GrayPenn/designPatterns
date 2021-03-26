package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/3/26 10:31 上午
 **/
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}