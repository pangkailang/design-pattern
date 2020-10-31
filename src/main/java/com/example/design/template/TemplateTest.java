package com.example.design.template;

public class TemplateTest {
    public static void main(String[] args) {
        CookTemplate cookTemplate = new PorkCook();
        CookTemplate cookTemplate1 = new VegetableCook();
        cookTemplate.cook();
        System.out.println("................");
        cookTemplate1.cook();
    }
}
