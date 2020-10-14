package com.huang.pojo;

/**
 * @author :huangao
 */
public class User {

    private String name;

    public User(){
        System.out.println("无参构造器==========");
    }

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("my name is:"+ this.name);
    }
}
