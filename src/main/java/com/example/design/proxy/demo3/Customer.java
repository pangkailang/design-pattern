package com.example.design.proxy.demo3;
/**
 * 实现客户端类
 */
public class Customer implements House {
    @Override
    public void buyHouse() {
        System.out.println("买个10栋房子。。。");
    }
}
