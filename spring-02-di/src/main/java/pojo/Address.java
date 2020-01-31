package pojo;

/**
 * @ClassName Address
 * @Description 地址
 * @Author WangXL
 * @Date 2020/1/30 11:44
 **/
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
