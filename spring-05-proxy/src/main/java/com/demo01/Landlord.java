package com.demo01;

/**
 * @ClassName Landlord
 * @Description 房东
 * @Author WangXL
 * @Date 2020/1/30 20:47
 **/
public class Landlord implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
