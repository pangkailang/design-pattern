package com.example.design.decorator;

public class MainTest {
    public static void main(String[] args) {
        House house = new BlankHouse();
        house.decorator();//大白房
        System.out.println("................");
        house = new SofaDecorator(house);
        house.decorator();//装修大沙发
        System.out.println("................");
        house = new WallDecorator(house);
        house.decorator();//装修大墙
        System.out.println("》》》》》》》》》》》");
        //上面的方式需要一次，一次装修，下面的方式则是一次性装修完
        House house1 = new WallDecorator(new SofaDecorator(new BlankHouse()));
        house1.decorator();
    }
}
