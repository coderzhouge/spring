package com.zhouge.bean;

public class Book {
    private String bname ;
    private String bauthor ;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testBook(){
        System.out.println(bname +"::"+bauthor);
    }

}

