package com.zhouge.test;

import com.zhouge.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
    @Test
    public void testUserService(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }
}
