package com.example.design.proxy.demo3;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib代理生成对象，实现MethodInterceptor接口
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    /**
     * 通过Enhancer创建一个子类进行代理。
     * @param target
     * @return
     */
    public Object getInstance(Object target)
    {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        //调用回调callback，会进入到intercept方法进行拦截，进而被代理
        enhancer.setCallback(this);
        Object obj = enhancer.create();
        return obj;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("办理点手续");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("搞点服务");
        return object;
    }
}
