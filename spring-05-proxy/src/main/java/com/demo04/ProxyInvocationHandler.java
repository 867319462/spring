package com.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyInvocationHandler
 * @Description 自动生成的代理类的类
 * @Author WangXL
 * @Date 2020/1/31 10:47
 **/
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的类
     */
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     *
     * @return 代理类
     */
    public Object getProxy() {
        // 类的位置、接口的位置、方法
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 处理代理实例，并返回结果
     *
     * @param proxy  代理
     * @param method 方法
     * @param args   参数
     * @return 结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        // 动态代理的本质，就是使用反射机制实现
        return method.invoke(target, args);
    }

    public void log(String msg) {
        System.out.println("[Debug] 执行了 " + msg + " 方法");
    }
}
