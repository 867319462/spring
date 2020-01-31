package com.demo01;

/**
 * @ClassName Proxy
 * @Description 中介（代理）
 * @Author WangXL
 * @Date 2020/1/30 20:59
 **/
public class Proxy implements Rent{

    @Override
    public void rent() {
        Landlord landlord = new Landlord();
        landlord.rent();
        showHost();
        signContract();
        cost();
    }

    public void showHost(){
        System.out.println("中介可以带着看房~~");
    }

    public void signContract(){
        System.out.println("中介可以签合同~~");
    }

    public void cost(){
        System.out.println("中介要收中介费~~");
    }
}
