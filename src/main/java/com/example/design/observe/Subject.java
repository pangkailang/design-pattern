package com.example.design.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class Subject {
    /**
     * 添加观察者
     * @param observe
     */
    public abstract void addObserve(Observe observe);

    /**
     *删除观察者
     * @param observe
     */
    public abstract void removeObserve(Observe observe);

    /**
     * 通知观察者
     */
    public abstract void notifyObserve();
}
