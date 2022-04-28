package com.zhouge.dao;

import com.zhouge.entity.Book;

import java.util.List;

public interface BookDao {

    //添加书籍
    void add(Book book);

    //修改书籍
    void update(Book book);

    //根据id删除书籍
    void delete(String id);

    //查询总书籍数量
    int findSingleValue();

    //查询一本书籍的详细信息（查询一行数据）
    Book findRow(String id);

    //查询所有书籍
    void findAll();

    //批量添加书籍
    void batchAddBook(List<Object[]> objects);

    //批量修改书籍
    void batchUpdateBook(List<Object[]> objects);

    //批量删除书籍
    void batchDeleteBook(List<Object[]> objects);
}
