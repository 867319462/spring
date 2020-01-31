package pojo;

/**
 * @ClassName Role
 * @Description 角色
 * @Author WangXL
 * @Date 2020/1/30 14:46
 **/
public class Role {
    private String role;

    public Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                '}';
    }
}
