import com.mapper.UserMapper;
import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName MyTest
 * @Description 测试
 * @Author WangXL
 * @Date 2020/1/31 15:51
 **/
public class MyTest {

    /**
     * mybatis的操作
     *
     * @throws IOException 异常
     */
    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user :
                users) {
            System.out.println(user);
        }
    }

    /**
     * spring的操作
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }

    /**
     * spring的第二种操作
     */
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper2 = context.getBean("userMapper2", UserMapper.class);
        for (User user : userMapper2.selectUser()) {
            System.out.println(user);
        }
    }

    /**
     * 事务
     */
    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        userMapper.selectUser();
    }
}
