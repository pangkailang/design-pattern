package com.example.design.proxy.demo2;

/**
 * 实现客户端类
 */
public class Customer implements House {
    @Override
    public void buyHouse() {
        System.out.println("买套房子玩玩。。。。。。。。。。");
    }
}
