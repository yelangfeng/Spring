package cn.csdas.yelf.transaction.one;

public class AccountServiceImple implements AccountService{
    private AccountDao accountDao;

    @Override
    public void transfer(String from, String to, float money) {
        accountDao.outMoney(from,money);
        accountDao.inMoney(to,money);
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
