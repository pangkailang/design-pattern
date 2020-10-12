package com.example.design.prototype;

public class MainTest {
    public static void main(String[] args) throws Exception{
        User user = new User("张三",20);
        Dept dept = new Dept("销售部", "007");
        //使用浅拷贝
        User user1=(User) user.clone();
        System.out.println(user1.getAge());
        System.out.println(user==user1);
        System.out.println("..................");
        user.setDept(dept);
        //使用浅拷贝
        User user2=(User)user.clone();
        System.out.println(user2.getAge());
        System.out.println(user==user2);
        System.out.println(user.getDept()==user2.getDept());
        System.out.println("..................");
        //使用深拷贝
        User user3=(User)user.deepClone();
        System.out.println(user3.getAge());
        System.out.println(user==user3);
        System.out.println(user.getDept()==user3.getDept());
        System.out.println("..................");
    }
}
