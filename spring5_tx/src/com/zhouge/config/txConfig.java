package com.zhouge.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource;

/**
 * 基于注解的声明式事务管理开发
 */
@Component//表明这个类是一个配置类
@ComponentScan(basePackages = "com.zhouge")//表明开启组件扫描
@EnableTransactionManagement//表明启用事务管理器
public class txConfig {

    private static final String url = "jdbc:mysql://175.178.238.233:3306/db_test?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false&rewriteBatchedStatements=true";

    /**
     * 创建数据库连接池对象
     * @return
     */
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername("admin");
        dataSource.setPassword("991227zg@.");
        return dataSource;
    }

    /**
     * 创建jdbcTemplate模板对象
     * @return
     */
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return  jdbcTemplate;
    }

    /**
     * 创建事务管理器对象
     * @return
     */
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

}
