package com.zhouge.test;

import com.zhouge.entity.Book;
import com.zhouge.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.List;

public class testBookService {

    @Test
    public void testBookAdd(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.add(new Book("6","《美猴王》","已出售"));
    }

    @Test
    public void testBookUpdate(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setbName("《无名书记》");
        book.setbId("2");
        bookService.update(book);
    }

    @Test
    public void testBookDelete(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("3");
    }

    @Test
    public void testBookFindSingleValue(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.findOne();
    }

    @Test
    public void testBookFindRow(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.findRow("1");
    }

    @Test
    public void testBookFindAll(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.findAllBooks();
    }

    @Test
    public void testBookBatchAddBook(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> objects = new ArrayList<>();
        Object[] book1 = {"8","《Java从入门到放弃》"};
        Object[] book2 = {"9","《MySQL学习手册》"};
        objects.add(book1);
        objects.add(book2);
        bookService.batchAddBook(objects);
    }

    @Test
    public void testBookBatchUpdateBook(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> objects = new ArrayList<>();
        Object[] book1 = {"<aa>","8"};
        Object[] book2 = {"<bb>","9"};
        objects.add(book1);
        objects.add(book2);
        bookService.batchUpdateBook(objects);
    }

    @Test
    public void testBookBatchDeleteBook(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> objects = new ArrayList<>();
        Object[] book1 = {"10"};
        Object[] book2 = {"9"};
        Object[] book3 = {"8"};
        objects.add(book1);
        objects.add(book2);
        objects.add(book3);
        bookService.batchDeleteBook(objects);
    }

}
