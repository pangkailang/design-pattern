package com.example.design.proxy.demo1;

public class MainTest {
    public static void main(String[] args) {
        House customer=new Customer();
        House house = new ProxyCustomer(customer);
        house.buyHouse();
    }
}
