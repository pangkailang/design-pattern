package com.example.design.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        SharePool sharePool = new SharePool();
        Share share1 = sharePool.setShare("法师");
        share1.setId("1");
        share1.setName("流浪法师");

        Share share2 = sharePool.setShare("法师");
        share2.setId("2");
        share2.setName("辛德拉");

        Share share3 = sharePool.setShare("刺客");
        share3.setId("3");
        share3.setName("劫");

        System.out.println(share1);
        System.out.println(share2);
        System.out.println(share3);
    }
}
