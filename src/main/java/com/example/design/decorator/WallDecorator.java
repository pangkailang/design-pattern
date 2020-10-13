package com.example.design.decorator;

public class WallDecorator implements House {
    private House house;
    public WallDecorator(House house) {
        this.house=house;
    }
    @Override
    public void decorator() {
        house.decorator();
        this.wallDecorate();
    }

    private void wallDecorate() {
        System.out.println("装修上了大墙");
    }
}
