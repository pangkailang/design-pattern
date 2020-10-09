package com.example.design.factoryDesign.demo3;

/**
 * 定义一个借口，有一个创建的方法，至于创建什么东西，借口不管，只是做行为规范
 */
public interface IHardComponentFactory {
    public HardComponent create();
}
