package pojo;

/**
 * @ClassName Position
 * @Description 职位
 * @Author WangXL
 * @Date 2020/1/29 21:20
 **/
public class Position {
    private String name;

    public Position(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Position{" +
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
