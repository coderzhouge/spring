package com.zhouge.entity;

public class User {
    private String uId;
    private String uName;
    private String uBalance;


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuBalance() {
        return uBalance;
    }

    public void setuBalance(String uBalance) {
        this.uBalance = uBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId='" + uId + '\'' +
                ", uName='" + uName + '\'' +
                ", uBalance='" + uBalance + '\'' +
                '}';
    }

    public User(String uId, String uName, String uBalance) {
        this.uId = uId;
        this.uName = uName;
        this.uBalance = uBalance;
    }

    public User() {
    }



}
