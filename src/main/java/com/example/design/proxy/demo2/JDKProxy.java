package com.example.design.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk代理对象生成类
 */
public class JDKProxy implements InvocationHandler {
    private House house;
    public JDKProxy(House house) {
        this.house=house;
    }

    /**
     * 获取代理对象的方法，实际上就是通过类加载器，以及类实现的接口，生成接口的实现类
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(house.getClass().getClassLoader(), house.getClass().getInterfaces(), this);
    }

    /**
     *通过代理类调用的时候，就会反射调用此方法。代理前，代理后的处理
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("办点手续");
        Object result = method.invoke(house, args);
        System.out.println("搞点服务");
        return result;
    }
}
