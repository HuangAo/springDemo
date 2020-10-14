package com.huang.service;

/**
 * @author :huangao
 */
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("增加了一个User");
    }

    public void delete() {
        System.out.println("删除了一个User");
    }

    public void update() {
        System.out.println("修改了一个User");
    }

    public void select() {
        System.out.println("查询了一个User");
    }
}
