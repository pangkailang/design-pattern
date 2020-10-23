package com.example.design.bridge;

public class MainTest {
    public static void main(String[] args) {
        Pen pen = new BigPen();
        Color redColor  = new RedColor();
        Color blackColor = new BlackColor();
        pen.setColor(redColor);
        pen.draw();
        System.out.println("............");
        pen.setColor(blackColor);
        pen.draw();

    }
}
