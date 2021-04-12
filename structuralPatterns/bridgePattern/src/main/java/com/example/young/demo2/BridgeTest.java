package com.example.young.demo2;

/**
 * @author pgy
 * @date 2021/4/12 4:04 下午
 **/
public class BridgeTest {
    public static void main(String[] args) {
        Abstraction abs = new RefinedAbstraction(new ConcreteImplementorA());
        abs.Operation();
    }
}
