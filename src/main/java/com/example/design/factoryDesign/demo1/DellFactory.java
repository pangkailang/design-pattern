package com.example.design.factoryDesign.demo1;

/**
 * 戴尔工厂，负责创建戴尔品牌下的键盘，鼠标
 */
public class DellFactory extends AbstractHardComponentFactory {
    @Override
    public HardComponent createKeyBoard() {
        System.out.println("创建一个戴尔产品");
        return new KeyBoard();
    }

    @Override
    public HardComponent createMouse() {
        System.out.println("创建一个戴尔产品");
        return new Mouse();
    }
}
