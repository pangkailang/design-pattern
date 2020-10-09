package com.example.design.constructDesign;

/**
 * 建造指挥者
 */
public class Director {
    private ComputerBuilder computerBuilder;
    //采用多态的形式维护一个builder对象
    public Director(ComputerBuilder computerBuilder){
        this.computerBuilder=computerBuilder;
    }

    /**
     * 提供一个建造的方法，将内部的组件统一进行创建
     * @return
     */
    public Computer constructComputer(){
        computerBuilder.buildEarphone();
        computerBuilder.buildKeyBoard();
        computerBuilder.buildMouse();
        return computerBuilder.getResult();
    }
    //测试
    public static void main(String[] args) {
        Computer computer = new Director(new AppleComputerBuilder()).constructComputer();
        System.out.println(computer.getEarphone()+"..."+computer.getKeyBoard()+"..."+computer.getMouse());
    }
}
