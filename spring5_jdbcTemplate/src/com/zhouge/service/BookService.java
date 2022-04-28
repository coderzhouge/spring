package com.zhouge.service;

import com.zhouge.dao.BookDao;
import com.zhouge.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void add(Book book){
        bookDao.add(book);
    }

    public void update(Book book){
        bookDao.update(book);
    }

    public void deleteBook(String id){
        bookDao.delete(id);
    }

    public int findOne(){
        int i = bookDao.findSingleValue();
        return i;
    }

    public void findRow(String id){
        Book book = bookDao.findRow(id);
    }

    public void findAllBooks(){
        bookDao.findAll();
    }

    public void batchAddBook(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

    public void batchUpdateBook(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

    public void batchDeleteBook(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }

}
