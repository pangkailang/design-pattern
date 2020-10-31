package com.example.design.observe;

/**
 * 观察者B
 */
public class ObserveB extends Observe {
    public ObserveB(Subject subject) {
        super(subject);
    }

    @Override
    public void dosomething() {
        System.out.println("我是B...做B事");
    }
}
