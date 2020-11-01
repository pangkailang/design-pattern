package com.example.design.mediator;

public class ColleagueA extends Colleague {

    @Override
    public void writeDoc(Mediator mediator) {
        System.out.println("我是A,我写完了");
        mediator.handleDoc();
    }

}
