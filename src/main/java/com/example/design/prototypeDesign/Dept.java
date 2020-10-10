package com.example.design.prototypeDesign;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dept implements Cloneable, Serializable {
    private String deptName;
    private String deptNo;

    public Dept(String deptName, String deptNo) {
        this.deptName = deptName;
        this.deptNo = deptNo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Dept)super.clone();
    }
}
