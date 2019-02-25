package cn.csdas.yelf.transaction.four;

public interface AccountDao {
    void outMoney(String from, float money);
    void inMoney(String to, float money);
}
