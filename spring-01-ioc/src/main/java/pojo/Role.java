package pojo;

/**
 * @ClassName Role
 * @Description 角色
 * @Author WangXL
 * @Date 2020/1/29 21:11
 **/
public class Role {
    private String name;

    public Role(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
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
