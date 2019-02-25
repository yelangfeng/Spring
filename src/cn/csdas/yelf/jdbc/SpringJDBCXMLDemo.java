package cn.csdas.yelf.jdbc;

import cn.csdas.yelf.transaction.one.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:JDBC.xml")
public class SpringJDBCXMLDemo {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Test
    //增加数据
    public void demo1(){
        jdbcTemplate.update("insert into account(name,money) values(?,?)","xuan99",74000);
    }

    @Test
    //修改数据
    public void demo2(){
        jdbcTemplate.update("update account set name=? where id=?","wang",1);
    }

    @Test
    //删除数据
    public void demo3(){
        jdbcTemplate.update("delete from account where id=?",1);
    }

    @Test
    //查询单个基础数据
    public void demo4(){
        String name = jdbcTemplate.queryForObject("select name from account where id=?",String.class,5);
        System.out.println(name);
        float money = jdbcTemplate.queryForObject("select money from account where id=?",Float.class,5);
        System.out.println(money);
    }

    @Test
    //查询对象类型
    public void demo5(){
        Account account = jdbcTemplate.queryForObject("select id,name,money from account where id=?",new MyRowMapper(),5);
        System.out.println(account);
    }

    @Test
    //查询集合对象
    public void demo6(){
        List<Account> list = jdbcTemplate.query("select * from account",new MyRowMapper());
        Iterator<Account> it = list.iterator();
        while(it.hasNext()){
            Account account = it.next();
            System.out.println(account);
        }
    }

    //数据封装
    class MyRowMapper implements RowMapper<Account>{

        @Override
        public Account mapRow(ResultSet resultSet, int i) throws SQLException {
            Account account = new Account();
            account.setId(resultSet.getInt("id"));
            account.setName(resultSet.getString("name"));
            account.setMoney(resultSet.getFloat("money"));
            return account;
        }
    }
}
