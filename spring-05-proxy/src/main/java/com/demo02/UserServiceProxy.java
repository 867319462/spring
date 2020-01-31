package com.demo02;

/**
 * @ClassName UserServiceProxy
 * @Description 用户操作代理
 * @Author WangXL
 * @Date 2020/1/30 21:26
 **/
public class UserServiceProxy implements UserService {
    private UserService userService = new UserServiceImpl();

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg) {
        System.out.println("[Debug] 使用了" + msg + "方法~~");
    }
}
