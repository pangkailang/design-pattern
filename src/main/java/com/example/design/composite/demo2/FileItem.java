package com.example.design.composite.demo2;

public class FileItem extends  File {
    private String name;

    public FileItem(String name) {
        this.name=name;
    }
    @Override
    public void listFile(String preStr){
        System.out.println(preStr+"-"+name);
    }

}
