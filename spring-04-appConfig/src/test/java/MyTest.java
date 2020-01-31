import com.config.AppConfig;
import com.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName MyTest
 * @Description
 * @Author WangXL
 * @Date 2020/1/30 19:55
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext((AppConfig.class));
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
    }
}
