package com.example.design.bridge;

public abstract class Pen {
    public Color color;
    public void setColor(Color color){
        this.color=color;
    }
    public abstract void draw();
}
