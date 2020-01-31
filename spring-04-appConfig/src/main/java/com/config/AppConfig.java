package com.config;

import com.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AppConfig
 * @Description
 * 注解：Configuration 也会被spring托管，注册到容器中，因为他本来就是一个组件，这是一个配置类，就像之前的xml文件
 * 注解：ComponentScan 自动扫描包内的所有注解
 * @Author WangXL
 * @Date 2020/1/30 19:52
 **/
@Configuration
@ComponentScan("com.pojo")
public class AppConfig {

    /**
     * 注解：Bean 相当于xml中的bean
     * 方法名 = bean的id
     * 返回值 = bean的class
     * @return 类
     */
    @Bean
    public User user(){
        return new User();
    }
}
