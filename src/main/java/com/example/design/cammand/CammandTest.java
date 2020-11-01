package com.example.design.cammand;

public class CammandTest {
    public static void main(String[] args) {
        Receiver receiver = new ReceiverA();
        Cammand cammand = new CammandA(receiver);
        Sender sender = new Sender(cammand);
        sender.addCammnd();
    }
}
