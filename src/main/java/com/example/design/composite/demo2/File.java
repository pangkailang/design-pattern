package com.example.design.composite.demo2;

/**
 * 定义文件的抽象类，里面包含了查看文件内容，添加文件，删除文件，查找文件的功能。
 */
public abstract class File {
    /**
     * 列出组合结构
     * @param preStr
     */
    public abstract void listFile(String preStr);

    /**
     * 添加
     * @param file
     * @throws Exception
     */
    public void addFile(File file) throws Exception{
        throw new Exception("具体文件不支持添加文件");
    }

    /**
     * 删除
     * @param file
     * @throws Exception
     */
    public void removeFile(File file) throws Exception{
        throw new Exception("具体文件不支持移除文件文件");
    }

    /**
     * 获取
     * @param index
     * @return
     * @throws Exception
     */
    public File getFile(Integer index) throws Exception{
        throw new Exception("具体文件不支持获取文件");
    }

}
