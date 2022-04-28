package com.zhouge.bean;

/**
 * 测试级联赋值
 */
public class Score {

    private String sName;

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Score{" +
                "sName='" + sName + '\'' +
                '}';
    }
}
