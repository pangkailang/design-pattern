package com.example.design.bridge;

public class GreenColor implements Color {
    @Override
    public void drawColor() {
        System.out.println("我能画绿色");
    }
}
