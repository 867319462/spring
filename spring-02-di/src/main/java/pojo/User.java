package pojo;

/**
 * @ClassName User
 * @Description 用户
 * @Author WangXL
 * @Date 2020/1/30 14:28
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
