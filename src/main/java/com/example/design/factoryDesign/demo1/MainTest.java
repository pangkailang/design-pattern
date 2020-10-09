package com.example.design.factoryDesign.demo1;

import com.example.design.factoryDesign.demo2.HardComponentFactory;

public class MainTest {
    public static void main(String[] args) throws Exception{
        AbstractHardComponentFactory dellFactory=new DellFactory();//创建戴尔工厂对象
        dellFactory.createKeyBoard();
        dellFactory.createMouse();
        System.out.println("....................");
        AbstractHardComponentFactory leveoFactory=new LeveoFactory();//创建联想工厂对象
        leveoFactory.createKeyBoard();
        leveoFactory.createMouse();
    }
}
