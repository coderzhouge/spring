package com.zhouge.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update tb_user set uBalance = uBalance + ? where uName = ?";
        int i = jdbcTemplate.update(sql, 100, "zhouge");
        System.out.println("userDaoImpl: addMoney()...");
    }

    @Override
    public void reduceMoney() {
        String sql = "update tb_user set uBalance = uBalance - ? where uName = ?";
        int i = jdbcTemplate.update(sql, 100, "yuyating");
        System.out.println("userDaoImpl:reduceMoney()...");
    }


}
