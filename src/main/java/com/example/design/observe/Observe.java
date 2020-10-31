package com.example.design.observe;

/**
 * 观察者抽象类
 */
public abstract class Observe {
    private Subject subject;
    public Observe(Subject subject){
        this.subject=subject;
    }

    /**
     * 具体做一些事情的抽象方法
     */
    public abstract void dosomething();
}
