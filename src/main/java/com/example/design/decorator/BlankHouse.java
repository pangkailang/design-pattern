package com.example.design.decorator;

/**
 * 空白房子，什么都不做
 */
public class BlankHouse implements House{
    @Override
    public void decorator() {
        System.out.println("我是一个空白房子");
    }
}
