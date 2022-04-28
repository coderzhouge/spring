package com.zhouge.test;

import com.zhouge.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUser {

    @Test
    public void testAdd(){

        /***
         * 通过spring创建对象:
         *  1>创建项目,导入依赖包
         *  2>创建javaBean类,写方法
         *  3>创建spring配置文件 xml
         *  4>通过<bean></bean>标签创建对象,并定义id和class属性
         *  5>创建测试类,用于测试结果
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.Add();
    }
}
