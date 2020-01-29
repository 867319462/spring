package pojo;

/**
 * @ClassName Product
 * @Description 产品
 * @Author WangXL
 * @Date 2020/1/29 21:13
 **/
public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
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
