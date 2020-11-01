package com.example.design.memento;

/**
 * 业务类
 */
public class Original {
    private Integer state;

    public Original(){
        this.state=0;
    }

    /**
     * 创建一个备忘录
     * @return
     */
    public Memento createMemento(){
        return new Memento(state);
    }

    public Integer getState(){
        return this.state;
    }

    /**
     * 修改状态
     */
    public void addVersion(){
        this.state = this.state+1;
    }

    /**
     * 恢复状态
     * @param memento
     */
    public void recoverFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
