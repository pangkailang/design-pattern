package com.example.design.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的主题实现
 */
public class Notify extends Subject {
    private List<Observe> observeList = new ArrayList<>();
    @Override
    public void addObserve(Observe observe) {
        this.observeList.add(observe);
    }
    @Override
    public void removeObserve(Observe observe) {
        this.observeList.remove(observe);
    }
    @Override
    public void notifyObserve() {
        if(observeList.size()>0){
            for (Observe observe: observeList) {
                observe.dosomething();
            }
        }
    }
}
