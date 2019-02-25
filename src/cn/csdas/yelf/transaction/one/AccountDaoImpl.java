package cn.csdas.yelf.transaction.one;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void outMoney(String from, float money) {
        this.jdbcTemplate.update("update account set money=money-? where name =?",money,from);
    }

    @Override
    public void inMoney(String to, float money) {
        this.jdbcTemplate.update("update account set money=money+? where name=?",money,to);
    }
}
