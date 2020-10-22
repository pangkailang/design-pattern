package com.example.design.proxy.demo1;

/**
 * 中介类
 */
public class ProxyCustomer implements House {
    private House house;
    public ProxyCustomer(House house){
        this.house=house;
    }
    @Override
    public void buyHouse() {
        before();
        //调用原方法
        house.buyHouse();
        after();
    }

    public void before() {
        System.out.println("买房之前中介帮你办理手续");
    }

    public void after() {
        System.out.println("买房之后中介帮你产生售后服务");
    }
}
