package com.zhouge.test;

import com.zhouge.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBook {
    @Test
    public void testBook(){

        /* 基于xml的方式注入属性
        *
        *   1\ 创建javabean类(属性\方法\set)
        *   2\ 创建spring配置文件
        *   3\ 创建<bean>配置对象
        *   4\ 创建<property>name value
        *   5\ 测试
        *
        *  */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Book book = context.getBean("book", Book.class);
        book.testBook();
        System.out.println("属性注入成功");

    }
}
