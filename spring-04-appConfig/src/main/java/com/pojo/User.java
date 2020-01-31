package com.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName User
 * @Description
 * @Author WangXL
 * @Date 2020/1/30 19:53
 **/
public class User {
    @Value("张三")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
