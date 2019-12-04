package cn.csdas.yelf.aop.xml.test;

public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("保存用户...");
        //int a = 1/0;
    }

    @Override
    public void delete() {
        System.out.println("删除用户...");
    }

    @Override
    public void update() {
        System.out.println("修改用户...");
    }

    @Override
    public void select() {
        System.out.println("查询用户...");
    }
}
