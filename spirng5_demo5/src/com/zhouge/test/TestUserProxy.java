package com.zhouge.test;

import com.zhouge.bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserProxy {

    @Test
    public void testUserProxy(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

}
