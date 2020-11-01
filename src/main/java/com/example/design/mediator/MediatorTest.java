package com.example.design.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MediatorHandle();
        Colleague colleagueA = new ColleagueA();
        Colleague colleagueB = new ColleagueB();
        colleagueA.writeDoc(mediator);
        colleagueB.writeDoc(mediator);
    }
}
