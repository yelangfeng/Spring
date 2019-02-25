package cn.csdas.yelf.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * spring JDBC测试
 */
public class SpringJDBCDemo {
    @Test
    //JDBC模板的使用类似DBUtils
    public void demo1(){
        //创建连接池
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://127.0.0.1:1433;databaseName=spring");
        dataSource.setUsername("sa");
        dataSource.setPassword("123");

        //创建JDBC模板
        //JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        jdbcTemplate.update("insert into account(name,money) values(?,?)","yelangfeng",10000);
    }

    @Test
    public void demo2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("JDBC.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ac.getBean("jdbcTemplate");
        jdbcTemplate.update("insert into account(name,money) values(?,?)","yelf",30000);
    }
}
