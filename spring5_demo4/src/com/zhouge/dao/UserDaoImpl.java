package com.zhouge.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("UserDaoImpl:add()...");
    }

    @Override
    public void update() {
        System.out.println("UserDaoImpl:update()...");
    }


}
