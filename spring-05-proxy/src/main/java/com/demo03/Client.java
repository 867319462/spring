package com.demo03;

/**
 * @ClassName Client
 * @Description
 * @Author WangXL
 * @Date 2020/1/31 10:59
 **/
public class Client {
    public static void main(String[] args) {
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        Object proxy = (Object) handler.getProxy();
        proxy.rent();
    }
}
