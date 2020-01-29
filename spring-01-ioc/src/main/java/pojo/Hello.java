package pojo;

/**
 * @ClassName Hello
 * @Description hello spring
 * @Author WangXL
 * @Date 2020/1/29 19:57
 **/
public class Hello {
    private String string;

    @Override
    public String toString() {
        return "pojo.Hello{" +
                "string='" + string + '\'' +
                '}';
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
