package com.zhouge.bean;

public class Emp {
    private String eName ;
    private String eGender ;
    private Dept dept ;

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void testEmp(){
        System.out.println(eName +"::"+eGender+"::"+dept);
    }

}
