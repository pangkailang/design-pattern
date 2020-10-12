package com.example.design.factory.demo3;

/**
 * 键盘工厂
 */
public class KeyBoardFactory implements IHardComponentFactory
{
    @Override
    public HardComponent create() {
        return new KeyBoard();
    }
}
