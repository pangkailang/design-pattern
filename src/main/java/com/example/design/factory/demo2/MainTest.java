package com.example.design.factory.demo2;

public class MainTest {
    public static void main(String[] args) throws Exception{
        HardComponentFactory hardComponentFactory=new HardComponentFactory();//创建工厂对象
        hardComponentFactory.createHardComponent("mouse");//创建鼠标对象
        hardComponentFactory.createHardComponent("keyBoard");//创建键盘对象
        hardComponentFactory.createHardComponent("AAA");//随便传参
    }
}
