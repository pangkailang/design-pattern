package com.example.design.prototype;

import lombok.Data;

import java.io.*;

@Data
public class User implements Cloneable,Serializable {
    private String name;
    private Integer age;
    private Dept dept;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    //浅拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
    //深拷贝
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
