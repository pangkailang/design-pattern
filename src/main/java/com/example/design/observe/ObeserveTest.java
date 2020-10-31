package com.example.design.observe;

public class ObeserveTest {
    public static void main(String[] args) {
        Subject subject = new Notify();
        Observe observeA= new ObserveA(subject);
        Observe observeB= new ObserveB(subject);
        //添加观察者
        subject.addObserve(observeA);
        subject.addObserve(observeB);
        //通知
        subject.notifyObserve();
    }
}
