package com.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName Log
 * @Description 前置日志
 * @Author WangXL
 * @Date 2020/1/31 12:14
 **/
public class BeforeLog implements MethodBeforeAdvice {

    /**
     * @param method 要执行的目标对象的方法
     * @param args   参数
     * @param target 目标对象
     */
    @Override
    public void before(Method method, Object[] args, Object target) {
        System.out.println("[Debug] " + target.getClass().getName() + " 执行了 " + method.getName() + " 方法");
    }

}
