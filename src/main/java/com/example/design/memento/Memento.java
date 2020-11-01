package com.example.design.memento;

/**
 * 备忘录
 */
public class Memento {
    private Integer state;
    public Memento(Integer state){
        this.state = state;
    }

    public Integer getState() {
        return this.state;
    }
}
