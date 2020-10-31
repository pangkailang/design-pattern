package com.example.design.composite.demo1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends  Component {
    private String name;
    private List<Component> childComponents = null;
    public Composite(String name) {
        this.name=name;
    }
    @Override
    public void someOperation(String preStr) {
        // 先把自己输出
        System.out.println(preStr + "+" + name);
        // 如果还包含其他子组件，那么就输出这些子组件对象
        if (null != childComponents) {
            // 添加一个空格，表示向后缩进一个空格
            preStr += "   ";
            // 输出当前对象的子组件对象
            for (Component component : childComponents) {
                // 递归地进行子组件相应方法的调用，输出每个子组件对象
                component.someOperation(preStr);
            }
        }
    }

    @Override
    public void removeChild(Component child) {
        if (null != child) {
            childComponents.remove(child);
        }
    }

    @Override
    public Component getChildren(int index) {
        if (null != childComponents) {
            if (index >= 0 && index < childComponents.size()) {
                return childComponents.get(index);
            }
        }
        return null;
    }

    @Override
    public void addChild(Component child) {
       if(null!=child){
           if (null == childComponents) {
               childComponents = new ArrayList<Component>();
           }
           childComponents.add(child);
       }
    }
}
