import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Person;

/**
 * @ClassName MyTest
 * @Description
 * @Author WangXL
 * @Date 2020/1/30 15:41
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) context.getBean("person");
        person.getCat().barking();
        person.getDog().barking();
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        Person person = (Person) context.getBean("person");
        person.getCat().barking();
        person.getDog().barking();
    }
}
