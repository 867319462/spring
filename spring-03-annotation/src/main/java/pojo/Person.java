package pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName Person
 * @Description 人
 * @Author WangXL
 * @Date 2020/1/30 15:34
 **/
public class Person {
    private String name;
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
