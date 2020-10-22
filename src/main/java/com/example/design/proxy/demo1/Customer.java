package com.example.design.proxy.demo1;

public class Customer implements House {
    @Override
    public void buyHouse() {
        System.out.println("我是客户我要想买一套房子");
    }
}
