package com.hkw.spring5;

/**
 * @ClassName : User
 * @Description :一个普通类
 * @Author : hkw
 * @Date: 2020-08-18 19:11
 */
public class User {

    private String name;
    private int age;

    public User() {
        System.out.println("解析xml方式默认调用无参构造方法创建对象");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void add() {
        System.out.println("add ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
