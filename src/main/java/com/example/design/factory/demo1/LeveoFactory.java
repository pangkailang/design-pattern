package com.example.design.factory.demo1;

/**
 * 联想工厂，负责生产联想下面的键盘鼠标
 */
public class LeveoFactory  extends  AbstractHardComponentFactory{
    @Override
    public HardComponent createKeyBoard() {
        System.out.println("创建一个联想键盘");
        return new KeyBoard();
    }

    @Override
    public HardComponent createMouse() {
        System.out.println("创建一个联想鼠标");
        return new Mouse();
    }
}
