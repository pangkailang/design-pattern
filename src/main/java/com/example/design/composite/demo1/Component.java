package com.example.design.composite.demo1;


public abstract class Component {
    // 示意方法，子组件对象可能有的功能方法
    public abstract void someOperation(String preStr);

    public void addChild(Component child) {
        // 缺省的实现，抛出异常，因为叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public void removeChild(Component child) {
        // 缺省的实现，抛出异常，因为叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public Component getChildren(int index) {
        // 缺省的实现，抛出异常，因为叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }
}
