package com.zhouge.test;

import com.zhouge.config.txConfig;
import com.zhouge.entity.User;
import com.zhouge.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class testUser {

    @Test
    public void testTransfer(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

    @Test
    public void testTransfer2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

    @Test
    public void testTransfer3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(txConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

    /**
     * spring支持函数式编程风格
     *  函数式创建对象，交给spring管理
     */
    @Test
    public void testGenericApplicationContext(){
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();//刷新，清空
        context.registerBean("user1", User.class, () -> new User());

        //获取在spring中创建的对象
        User user1 = (User) context.getBean("user1");
        System.out.println(user1);
    }

}
