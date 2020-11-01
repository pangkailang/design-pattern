package com.example.design.cammand;

/**
 * 添加命令，并发送
 */
public class Sender {
    public Cammand cammand;

    public Sender(Cammand cammand) {
        this.cammand=cammand;
    }
    public void addCammnd() {
        System.out.println("添加了一条命令");
        cammand.execute();
    }
}
