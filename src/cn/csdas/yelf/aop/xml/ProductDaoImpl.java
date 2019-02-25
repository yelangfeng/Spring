package cn.csdas.yelf.aop.xml;

public class ProductDaoImpl implements ProductDao{
    @Override
    public void save(){
        System.out.println("保存商品...");
    }

    @Override
    public String delete() {
        System.out.println("删除商品...");
        return "电饭锅";
    }

    @Override
    public void find() {
        System.out.println("查找商品...");
       // int a = 1/0;
    }

    @Override
    public void update() {
        System.out.println("修改商品...");
    }
}
