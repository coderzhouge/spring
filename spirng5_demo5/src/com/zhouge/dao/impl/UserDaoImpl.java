package com.zhouge.dao.impl;

import com.zhouge.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("方法正在被执行: " + (a+b));
        return a+b;
    }

    @Override
    public void update(String id) {
        
    }

}
