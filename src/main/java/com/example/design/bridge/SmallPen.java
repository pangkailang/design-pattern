package com.example.design.bridge;

public class SmallPen extends Pen{
    @Override
    public void draw() {
        System.out.println("我是一支小笔");
        color.drawColor();
    }
}
