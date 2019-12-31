package cn.csdas.yelf.aop.zhujie.test;

public class EmpDaoImpl implements EmpDao{
    @Override
    public void save() {
        System.out.println("保存员工...");
    }

    @Override
    public void delete() {
        System.out.println("删除员工...");
    }

    @Override
    public void update() {
        System.out.println("修改员工...");
    }

    @Override
    public void select() {
        System.out.println("查询员工...");
    }
}
