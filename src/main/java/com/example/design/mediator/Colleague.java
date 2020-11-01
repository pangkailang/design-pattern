package com.example.design.mediator;

/**
 * 同事抽象类，含有一个写文档的方法，引入一个中介者
 */
public abstract class Colleague {
    public abstract void writeDoc(Mediator mediator);

}
