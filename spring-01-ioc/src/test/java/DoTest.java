import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Position;
import pojo.Product;
import pojo.Role;
import pojo.User;

/**
 * @ClassName UserTest
 * @Description
 * @Author WangXL
 * @Date 2020/1/29 20:57
 **/
public class DoTest {
    public static void main(String[] args) {
        // spring就像婚介网站，用不用都会被创建
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");
        System.out.println(user.toString());

        Role role = (Role) context.getBean("role");
        System.out.println(role.toString());

        Product product = (Product) context.getBean("product");
        System.out.println(product.toString());

        Position position = (Position) context.getBean("position");
        System.out.println(position.toString());
    }
}
