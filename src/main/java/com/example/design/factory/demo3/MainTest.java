package com.example.design.factory.demo3;

public class MainTest {
    public static void main(String[] args) {
        IHardComponentFactory keyBoardFactory=new KeyBoardFactory();//创建键盘工厂
        HardComponent keyBoard = keyBoardFactory.create();//创建键盘
        IHardComponentFactory mouseFactory=new MouseFactory();//创建鼠标工厂
        HardComponent mouse = mouseFactory.create();//创建鼠标
    }
}
