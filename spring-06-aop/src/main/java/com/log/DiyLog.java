package com.log;

/**
 * @ClassName DiyLog
 * @Description 自定义日志
 * @Author WangXL
 * @Date 2020/1/31 13:25
 **/
public class DiyLog {
    public void before(){
        System.out.println("=========执行前========");
    }

    public void after(){
        System.out.println("=========执行后========");
    }
}
