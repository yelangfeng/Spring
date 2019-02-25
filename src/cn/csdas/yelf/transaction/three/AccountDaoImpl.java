package cn.csdas.yelf.transaction.three;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void outMoney(String from, float money) {
        this.getJdbcTemplate().update("update account set money=money-? where name =?",money,from);
    }

    @Override
    public void inMoney(String to, float money) {
        this.getJdbcTemplate().update("update account set money=money+? where name=?",money,to);
    }
}
