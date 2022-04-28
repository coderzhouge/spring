package com.zhouge.entity;

public class Book {

    private String bId;
    private String bName;
    private String bStatus;

    public Book(String bId, String bName, String bStatus) {
        this.bId = bId;
        this.bName = bName;
        this.bStatus = bStatus;
    }

    public Book() {
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbStatus() {
        return bStatus;
    }

    public void setbStatus(String bStatus) {
        this.bStatus = bStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bId='" + bId + '\'' +
                ", bName='" + bName + '\'' +
                ", bStatus='" + bStatus + '\'' +
                '}';
    }
}
