package com.zhouge.bean;

public class Student {

    private String stuName ;
    private String stuSex ;

    public void setScore(Score score) {
        this.score = score;
    }

    private Score score ;

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }


    public void testStu(){

        System.out.println(stuName + "::" + stuSex);
    }

    public void testStuScore(){
        System.out.println(stuName + "::" + stuSex+"::"+score);
    }


}
