package com.zhouge.bean;

public class Course {

    private String cName ;
    private float score ;

    public void setScore(int score) {
        this.score = score;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                ", score=" + score +
                '}';
    }

}
