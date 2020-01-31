import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Address;
import pojo.Student;
import pojo.User;

import java.util.Arrays;

/**
 * @ClassName DoTest
 * @Description
 * @Author WangXL
 * @Date 2020/1/30 12:14
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("姓名：" + student.getName());
        System.out.println("地址：" + student.getAddress());
        System.out.println("书籍：" + Arrays.toString(student.getBooks()));
        System.out.println("爱好：" + student.getHobbys());
        System.out.println("学生证：" + student.getCard());
        System.out.println("游戏：" + student.getGames());
        System.out.println("信息：" + student.getInfo());
        System.out.println("妻子：" + student.getWife());
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getName());

        Address address1 = (Address) context.getBean("address");
        Address address2 = (Address) context.getBean("address");
        System.out.println(address1 == address2);

        Student student1 = (Student) context.getBean("student");
        Student student2 = (Student) context.getBean("student");
        System.out.println(student1 == student2);
    }

}
