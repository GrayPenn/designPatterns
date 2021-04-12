package com.example.young.demo2;

/**
 * @author pgy
 * @date 2021/4/12 4:04 下午
 **/
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }
    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.OperationImpl();
    }
}