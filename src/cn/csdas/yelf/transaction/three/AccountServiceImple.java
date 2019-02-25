package cn.csdas.yelf.transaction.three;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImple implements AccountService {
    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(String from, String to, float money) {

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            //启用事物管理
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(from,money);
                //int a = 1/0;
                accountDao.inMoney(to,money);
            }
        });
/*
        accountDao.outMoney(from,money);
        int a = 1/0;
        accountDao.inMoney(to,money);
        */
    }


    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}
