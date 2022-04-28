package com.zhouge.test;

import com.zhouge.bean.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
    @Test
    public void testFactoryBean(){
        //FactoryBean
        ApplicationContext context = new  ClassPathXmlApplicationContext("spring5.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
