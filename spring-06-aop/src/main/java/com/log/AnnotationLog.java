package com.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName AnnotationLog
 * @Description 注解实现aop
 * @Author WangXL
 * @Date 2020/1/31 13:44
 **/
@Aspect
public class AnnotationLog {

    @Before("execution(* com.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=========方法执行前=========");
    }
}
