package com.example.design.bridge;

public class BlackColor implements Color {
    @Override
    public void drawColor() {
        System.out.println("我能画黑色");
    }
}
