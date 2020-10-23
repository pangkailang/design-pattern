package com.example.design.proxy.demo2;

public class MainTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        JDKProxy jdkProxy = new JDKProxy(customer);
        House customerProxy = jdkProxy.getProxy();
        customerProxy.buyHouse();
    }
}
