package cn.csdas.yelf.transaction.two;

public interface AccountDao {
    void outMoney(String from, float money);
    void inMoney(String to, float money);
}
