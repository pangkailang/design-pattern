package com.example.design.factoryDesign.demo2;

/**
 * 生产硬件组件的工厂
 */
public class HardComponentFactory {
    public HardComponent createHardComponent(String type) throws Exception{
        //通过类型进行匹配
        if("keyBoard".equals(type)){
            return  new KeyBoard();
        }else if("mouse".equals(type)){
            return  new Mouse();
        }else{
            //如果没有匹配上，那么就抛出异常
            throw new Exception("未匹配到产品类型,请保证类型正确");
        }
    }
}
