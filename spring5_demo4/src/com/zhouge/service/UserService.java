package com.zhouge.service;

import com.zhouge.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserService {

    /**
     * autowired 根据类型进行注入
     * qualifier 根据名称进行注入
     */

    @Value(value = "zhouge")
    private String name ;


    @Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDaoImpl userDaoImpl;


    //@resource 是根据类型注入
    @Resource(name = "userDaoImpl1")//根据名称注入
    private UserDaoImpl userDaoImpl2 ;

    public void add(){
        userDaoImpl.add();
        userDaoImpl2.update();
        System.out.println(name);//value 普通属性注入
    }

}
