## java配置

### 1.添加POJO

```java
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
```

### 2.添加基本配置

```java
@Configuration
public class AppConfig {

    @Bean
    public User user(){
        return new User();
    }
}
```

### 3.注解
1. @Configuration spring注解 相对于之前的xml文件
2. @Bean spring注解 相当于之前xml文件中的bean标签
3. @ComponentScan spring注解 自动扫描包中的注解
4. @Bean与@ComponentScan使用一个就可以了
5. @Import spring注解，相当于xml中的import标签
