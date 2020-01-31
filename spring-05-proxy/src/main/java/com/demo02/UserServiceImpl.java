package com.demo02;

/**
 * @ClassName UserServiceImpl
 * @Description 用户操作的实现
 * @Author WangXL
 * @Date 2020/1/30 21:20
 **/
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加了一个用户~~");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户~~");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户~~");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户~~");
    }
}
