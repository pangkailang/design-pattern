package com.example.design.template;

public abstract class CookTemplate {
    /**
     *炒菜的方法
     */
    public void cook() {
        //洗菜
        method1();
        method2();
        method3();
        method4();
    }

    /**
     * 洗菜
     */
    public void method1() {
        System.out.println("先洗一下");
    }

    /**
     * 生火
     */
    public void method2() {
        System.out.println("火生起来");
    }

    /**
     * 自定义步骤
     */
    public abstract void method3();

    /**
     * 自定义步骤
     */
    public abstract void method4();
}
