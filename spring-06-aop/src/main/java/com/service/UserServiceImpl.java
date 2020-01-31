package com.service;

/**
 * @ClassName UserServiceImpl
 * @Description 用户业务的实现类
 * @Author WangXL
 * @Date 2020/1/31 12:11
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void insert() {
        System.out.println("添加了一个用户~~");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户~~");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户~~");
    }

    @Override
    public void select() {
        System.out.println("查询了一个用户~~");
    }
}
