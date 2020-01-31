package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description 用户
 * 注解：Component是组件，相当于XML中添加了一个bean
 * @Author WangXL
 * @Date 2020/1/30 19:04
 **/
@Component
public class User {

    @Value("张三")
    private String name;

}
