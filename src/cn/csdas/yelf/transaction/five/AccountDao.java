package cn.csdas.yelf.transaction.five;

public interface AccountDao {
    void outMoney(String from, float money);
    void inMoney(String to, float money);
}
