package cn.csdas.yelf.aop.xml.test;

public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("保存用户...");
    }
}
