import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

/**
 * @ClassName DoTest
 * @Description
 * @Author WangXL
 * @Date 2020/1/30 19:07
 **/
public class DoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // User user = (User) context.getBean(User.class); 是等价的
        User user = (User) context.getBean("user");

        System.out.println(user.getName());
    }
}
