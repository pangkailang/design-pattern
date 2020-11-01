package com.example.design.mediator;

public class ColleagueB extends Colleague {
    @Override
    public void writeDoc(Mediator mediator) {
        System.out.println("我是B,我写完了");
        mediator.handleDoc();
    }
}
