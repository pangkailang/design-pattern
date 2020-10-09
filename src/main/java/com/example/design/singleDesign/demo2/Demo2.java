package com.example.design.singleDesign.demo2;

public class Demo2 {
    //静态成员变量初期不初始化对象，懒得先初始化
    private static Demo2 demo2;
    //私有化构造方法，必须
    private Demo2(){}
    public synchronized static Demo2 getInstance(){
        if(demo2==null){//1.判断对象为空则初始化，否则直接返回
            demo2=new Demo2();//2
        }
        return demo2;
    }
}
