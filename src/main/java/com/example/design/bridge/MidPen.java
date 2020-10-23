package com.example.design.bridge;

public class MidPen extends Pen {
    @Override
    public void draw() {
        System.out.println("我是一支中性笔");
        color.drawColor();
    }
}
