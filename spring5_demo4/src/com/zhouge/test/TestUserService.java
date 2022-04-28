package com.zhouge.test;

import com.zhouge.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {

    @Test
    public void TestUserService(){

        /**
         * 基于注解的方式创建对象
         * 1\引入依赖
         * 2\开启组件扫描
         * 3\创建类,配置注解
         * 4\测试
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        
    }

}
