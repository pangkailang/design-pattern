package com.example.design.factoryDesign.demo3;

/**
 * 鼠标工厂
 */
public class MouseFactory implements IHardComponentFactory {
    @Override
    public HardComponent create() {
        return new Mouse();
    }
}
