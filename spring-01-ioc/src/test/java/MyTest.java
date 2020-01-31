import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Hello;

/**
 * @ClassName MyTest
 * @Description 测试
 * @Author WangXL
 * @Date 2020/1/29 20:11
 **/
public class MyTest {
    public static void main(String[] args) {
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象都在spring中进行管理，需要使用，直接获取就可以了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

        Hello h1 = (Hello) context.getBean("h1");
        System.out.println(h1 == hello);
    }
}
