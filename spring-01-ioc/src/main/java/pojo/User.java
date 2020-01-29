package pojo;

/**
 * @ClassName User
 * @Description 用户
 * @Author WangXL
 * @Date 2020/1/29 20:52
 **/
public class User {
    private String name;

    public User() {
        System.out.println("无参构造器！");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
