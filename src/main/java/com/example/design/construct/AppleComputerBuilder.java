package com.example.design.construct;

/**
 * 具体某个品牌电脑的创建实现类，进行自己的组件创建
 */
public class AppleComputerBuilder extends ComputerBuilder {
    @Override
    public void buildMouse() {
        computer.setMouse("mouse");
    }

    @Override
    public void buildKeyBoard() {
        computer.setKeyBoard("keyBoard");
    }

    @Override
    public void buildEarphone() {
        computer.setEarphone("earphone");
    }
}
