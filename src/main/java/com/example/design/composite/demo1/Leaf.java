package com.example.design.composite.demo1;

public class Leaf extends  Component {
    private String name = "";
    @Override
    public void someOperation(String preStr) {
        System.out.println(preStr + "-" + name);
    }

    public Leaf(String name) {
        this.name = name;
    }
}
