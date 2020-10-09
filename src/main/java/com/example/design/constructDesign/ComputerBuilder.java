package com.example.design.constructDesign;

/**
 * 创建builder抽象类，封装了各种创建组件的方法
 */
public abstract class ComputerBuilder {
    //维护一个计算机对象，用于返回
    protected Computer computer = new Computer();
    public abstract void buildMouse();
    public abstract void buildKeyBoard();
    public abstract void buildEarphone();
    public Computer getResult(){
        return computer;
    }
}
