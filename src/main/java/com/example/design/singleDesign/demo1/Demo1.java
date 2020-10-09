package com.example.design.singleDesign.demo1;

public class Demo1 {
    //直接在这里就初始化，管它需不需要,这就饿汉模式，饥渴难耐，必须初始化
    private static  Demo1 demo1=new Demo1();
    //私有化构造方法，必须
    private Demo1(){}
    public static Demo1 getInstance(){
        return demo1;
    }
}
