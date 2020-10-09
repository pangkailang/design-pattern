package com.example.design.factoryDesign.demo1;

/**
 * 定义一个抽象工厂类，里面包含一个簇的产品创建方法
 */
public abstract class AbstractHardComponentFactory {
    public abstract HardComponent createKeyBoard();
    public abstract HardComponent createMouse();
}
