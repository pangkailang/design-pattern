package com.example.design.observe;

/**
 * 观察者A
 */
public class ObserveA extends Observe{

    public ObserveA(Subject subject) {
        super(subject);
    }
    @Override
    public void dosomething() {
        System.out.println("我是A...做A事");
    }
}
