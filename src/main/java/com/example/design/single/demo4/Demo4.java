package com.example.design.single.demo4;

public class Demo4 {
    private static class Demo4Holder{//定义一个内部类
        private static Demo4 demo4=new Demo4();//初始化方法
    }
    //私有化构造器，必须
    private Demo4(){}
    public Demo4 getInstance(){
        return Demo4Holder.demo4;//获取实例
    }
}
