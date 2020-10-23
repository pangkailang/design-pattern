package com.example.design.proxy.demo3;

import java.util.concurrent.CountDownLatch;

public class MainTest {
    public static void main(String[] args) {
        House customer = new Customer();
        CglibProxy cglibProxy = new CglibProxy();
        House house = (House)cglibProxy.getInstance(customer);
        house.buyHouse();
    }
}
