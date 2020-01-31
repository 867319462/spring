package com.demo02;

/**
 * @ClassName Client
 * @Description 客户端
 * @Author WangXL
 * @Date 2020/1/30 21:27
 **/
public class Client {
    public static void main(String[] args) {
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
