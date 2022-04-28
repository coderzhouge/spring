package com.zhouge.test;

import com.zhouge.bean.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBookProxy {

    @Test
    public void testBookProxy(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springXml.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
