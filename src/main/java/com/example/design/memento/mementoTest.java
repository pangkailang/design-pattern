package com.example.design.memento;

public class mementoTest {
    public static void main(String[] args) {
        Original original = new Original();
        System.out.println("保存的状态："+original.getState());
        Memento memento = new Memento(original.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento("test",memento);
        original.addVersion();
        System.out.println("修改后的状态："+original.getState());
        original.recoverFromMemento(caretaker.getMemento("test"));
        System.out.println("恢复的状态"+original.getState());
    }

}
