## 注解

### 开启注解
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <!--开启注解的支持-->
    <context:annotation-config/>

</beans>
```
### 注解类型
1. @Autowire  spring的注解，byName、byType的集合
2. @Resource  java的注解，byName、byType的集合
3. @Nullable  spring的注解，说明这个字段可以为null
4. @Component  spring的注解，组件，放在类上，相当于添加了一个bean，被spring管理了
5. @Controller spring的注解，与组件功能相同，主要使用与Controller层
6. @Service  spring的注解，与组件功能相同，主要使用在Service层
7. @Repository  spring的注解，与组件功能相同，主要使用在Dao层
8. @Value  spring的注解，给属性添加值
9. @Scope  spring的注解，设置作用域
