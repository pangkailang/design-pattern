package com.example.design.singleDesign.demo3;

public class Demo3 {
    //静态成员变量初期不初始化对象
    private static volatile  Demo3 demo3;
    //私有化构造方法，必须
    private Demo3(){}
    public static Demo3 getInstance() {
        if (demo3 == null) {//1.判断对象为空则初始化，否则直接返回
            synchronized (Demo3.class) {//2.给对象上锁
                if(demo3==null){//3.再次判断是否为空
                    demo3 = new Demo3();//4.初始化
                }
            }
        }
        return demo3;
    }
}
