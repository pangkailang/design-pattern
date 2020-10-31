package com.example.design.composite.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileDir extends  File {
    private String name;
    List<File> childFiles=null;
    public FileDir(String name) {
        this.name=name;
    }
    @Override
    public void listFile(String preStr){
        System.out.println(preStr+"+"+name);
        preStr += " ";
        if(childFiles!=null && childFiles.size()>0){
            for (File file:childFiles) {
                file.listFile(preStr);
            }
        }
    }

    /**
     * 添加文件
     * @param file
     * @throws Exception
     */
    @Override
    public void addFile(File file) throws Exception {
        if(null!=file){
            if (childFiles == null) {
                childFiles = new ArrayList<>();
            }
            childFiles.add(file);
        }
    }

    /**
     * 移除文件
     * @param file
     * @throws Exception
     */
    @Override
    public void removeFile(File file) throws Exception {
        if(null != file){
            if (childFiles != null && childFiles.size()>0) {
                childFiles.remove(file);
            }
        }
    }

    @Override
    public File getFile(Integer index) {
        if(childFiles!=null&& index>0 && index<childFiles.size()){
            return childFiles.get(index);
        }
        return null;
    }
}
