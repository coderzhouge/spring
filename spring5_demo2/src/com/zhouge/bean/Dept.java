package com.zhouge.bean;

public class Dept {
    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }

    private String dName ;
}
