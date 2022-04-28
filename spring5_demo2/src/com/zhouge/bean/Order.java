package com.zhouge.bean;

public class Order {
    private String orderId ;
    private String address ;

    public Order(String orderId ,String address){
        this.orderId = orderId;
        this.address = address;
    }

    public void testOrder(){
        System.out.println(orderId + "::" + address);
    }
}
