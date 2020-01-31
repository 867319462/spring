package com.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName AfterLog
 * @Description 后置日志
 * @Author WangXL
 * @Date 2020/1/31 12:26
 **/
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) {
        System.out.println("[Debug] " + method.getName() + " 方法的返回结果为： " + returnValue);
    }
}
