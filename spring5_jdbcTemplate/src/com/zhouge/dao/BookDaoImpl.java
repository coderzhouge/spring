package com.zhouge.dao;

import com.zhouge.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    //自动装配jdbcTemplate对象
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加书籍
     * @param book
     */
    @Override
    public void add(Book book) {
        String sql = "insert into tb_book values(?,?,?)";
        Object[] args = {book.getbId(),book.getbName(),book.getbStatus()};
        int i = jdbcTemplate.update(sql, args);
        System.out.println("add():"+i);
    }

    /**
     * 修改书籍
     * @param book
     */
    @Override
    public void update(Book book) {
        String sql = "update tb_book set bookName = ? where bookId = ?";
        Object[] args = {book.getbName(),book.getbId()};
        int i = jdbcTemplate.update(sql, args);
        System.out.println("update():"+i);
    }

    /**
     * 根据id删除书籍
     * @param id
     */
    @Override
    public void delete(String id) {
        String sql = "delete from tb_book where bookId = ?;";
        int i = jdbcTemplate.update(sql, id);
        System.out.println("delete():"+i);
    }

    /**
     * 查询书籍总数
     * @return
     */
    @Override
    public int findSingleValue() {
        String sql = "select count(*) from tb_book;";
        //jdbcTemplate.queryForObject(String sql ,  Class<T> requiredType ) 返回值类型的类
        Integer i = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("count():"+i);
        return i;
    }

    /**
     * 根据id查询某一本书籍的信息
     * @param id
     * @return
     */
    @Override
    public Book findRow(String id) {
        String sql = "select bookId as bId,bookName as bName,bookStatus bStatus from tb_book where bookId = ? ";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),id);
        System.out.println(book);
        return book;
    }

    /**
     * 查询所有书籍
     */
    @Override
    public void findAll() {
        String sql = "select bookId as bId,bookName as bName,bookStatus bStatus from tb_book;";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        System.out.println(bookList);
    }

    @Override
    public void batchAddBook(List<Object[]> args) {
        String sql = "insert into tb_book(bookId,bookName) values(?,?)";//注意：末尾不能添加 ；
        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(ints);
    }

    @Override
    public void batchUpdateBook(List<Object[]> objects) {
        String sql = "update tb_book set bookName = ? where bookId = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(List<Object[]> objects) {
        String sql = "delete from tb_book where bookId = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, objects);
        System.out.println(Arrays.toString(ints));
    }

}
