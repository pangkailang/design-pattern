package com.example.design.decorator;

import com.example.design.adapter.demo3.AbstractAdapter;

/**
 * 装饰器抽象类
 */
public abstract class AbstractDecorator implements House{
    private House house;

    public AbstractDecorator(House house){
        this.house=house;
    }

    @Override
    public void decorator() {
        this.house.decorator();
    }
}
