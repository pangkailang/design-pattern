package com.example.design.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 负责管理备忘录
 */
public class Caretaker {
    Map<String,Memento> mementos = new HashMap<>();

    public void addMemento(String key, Memento memento){
        mementos.put(key,memento);
    }

    public Memento getMemento(String key){
        return mementos.get(key);
    }
}
