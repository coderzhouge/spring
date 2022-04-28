package com.zhouge.test;

import com.zhouge.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUser {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        User user = (User)context.getBean("user");
        //User user1 = context.getBean("user", User.class);
        user.Add();
    }
}
