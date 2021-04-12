package com.example.young.demo2;

/**
 * @author pgy
 * @date 2021/4/12 4:04 下午
 **/
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}