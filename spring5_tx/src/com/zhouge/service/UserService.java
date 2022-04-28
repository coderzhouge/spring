package com.zhouge.service;

import com.zhouge.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public void transfer(){
        userDao.reduceMoney();
        int i = 10/0;
        userDao.addMoney();
    }

}
