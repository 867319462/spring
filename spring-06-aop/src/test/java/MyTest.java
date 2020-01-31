import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Description
 * @Author WangXL
 * @Date 2020/1/31 13:04
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) context.getBean("userServiceImpl");

        userService.insert();
        userService.delete();
        userService.update();
        userService.select();
    }
}
