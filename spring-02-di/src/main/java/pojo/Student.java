package pojo;

import java.util.*;

/**
 * @ClassName Student
 * @Description 学生
 * @Author WangXL
 * @Date 2020/1/30 11:44
 **/
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 地址
     */
    private Address address;
    /**
     * 书
     */
    private String[] books;
    /**
     * 爱好
     */
    private List<String> hobbys;
    /**
     * 学生证
     */
    private Map<Integer, String> card;
    /**
     * 游戏
     */
    private Set<String> games;
    /**
     * 信息
     */
    private Properties info;
    /**
     * 妻子
     */
    private String wife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<Integer, String> getCard() {
        return card;
    }

    public void setCard(Map<Integer, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", games=" + games +
                ", info=" + info +
                ", wife='" + wife + '\'' +
                '}';
    }
}
