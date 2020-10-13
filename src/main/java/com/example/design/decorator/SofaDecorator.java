package com.example.design.decorator;

/**
 * 沙发装饰器
 */
public class SofaDecorator extends AbstractDecorator {
    public SofaDecorator(House house) {
        super(house);
    }

    /**
     * 核心在于装修的时候，先保留之前的装修方案
     */
    @Override
    public void decorator() {
        super.decorator();
        this.sofaDecorator();
    }

    private void sofaDecorator() {
        System.out.println("装修了大沙发");
    }
}
