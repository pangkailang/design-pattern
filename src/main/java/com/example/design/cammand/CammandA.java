package com.example.design.cammand;

/**
 * 命令实现类，调用具体做事的方法
 */
public class CammandA extends  Cammand {
    public CammandA(Receiver receiver) {
        super(receiver);
    }
    @Override
    public void execute() {
        receiver.dosomething();
    }
}
