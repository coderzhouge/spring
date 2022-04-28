package com.zhouge.test;

import com.zhouge.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testBook(){
        //scope:singleton  单实例对象模式  在配置文件加载时就自动创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

        System.out.println(book1);
        System.out.println(book2);

    }

    @Test
    public void testBook2(){
        //scope:prototype  多实例对象模式  在getBean() 方法被调用时创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Book book1 = context.getBean("book2", Book.class);
        Book book2 = context.getBean("book2", Book.class);

        System.out.println(book1);
        System.out.println(book2);

    }
}
