package com.example.design.bridge;

public class BigPen extends Pen {
    @Override
    public void draw() {
        System.out.println("我是一支大笔");
        color.drawColor();
    }
}
