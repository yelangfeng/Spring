package cn.csdas.yelf.transaction.four;

public class AccountServiceImple implements AccountService {
    private AccountDao accountDao;

    @Override
    public void transfer(String from, String to, float money) {
        accountDao.outMoney(from,money);
        //int a = 1/0;
        accountDao.inMoney(to,money);
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
