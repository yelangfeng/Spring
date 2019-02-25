package cn.csdas.yelf.transaction.five;


import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountServiceImple implements AccountService {
    private AccountDao accountDao;

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)   //启用事物管理
    public void transfer(String from, String to, float money) {
        accountDao.outMoney(from,money);
       // int a = 1/0;
        accountDao.inMoney(to,money);
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
