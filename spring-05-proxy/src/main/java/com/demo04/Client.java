package com.demo04;

import com.demo02.UserService;
import com.demo02.UserServiceImpl;

/**
 * @ClassName Client
 * @Description 客户端
 * @Author WangXL
 * @Date 2020/1/31 11:20
 **/
public class Client {
    public static void main(String[] args) {
        // 真实角色（类）
        UserServiceImpl service = new UserServiceImpl();
        // 代理角色（不存在的）
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        // 代理的对象
        handler.setTarget(service);
        // 动态生成代理类（代理接口）
        UserService proxy = (UserService) handler.getProxy();

        proxy.add();
    }
}
