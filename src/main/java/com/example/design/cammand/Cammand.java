package com.example.design.cammand;

/**
 * 命令对象，提供执行的方法
 */
public abstract class Cammand {
    public Receiver receiver;

    public Cammand(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
