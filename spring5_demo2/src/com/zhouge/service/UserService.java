package com.zhouge.service;

import com.zhouge.dao.UserDao;

public class UserService {

    //第一步:创建需要引用的对象
    public UserDao userDao ;

    //创建set()方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //测试方法
    public void add(){
        System.out.println("UserService add()....");
        userDao.update();
    }

}
