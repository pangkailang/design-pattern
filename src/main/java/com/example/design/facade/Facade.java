package com.example.design.facade;

public class Facade {
    public void method() {
        method1();
        method2();
        method3();
    }
    public void method1() {
        System.out.println("我是方法一做了很多事情");
    }
    public void method2() {
        System.out.println("我是方法二也做了很多事情");
    }
    public void method3() {
        System.out.println("我是方法三还是做了很多事情");
    }


}
