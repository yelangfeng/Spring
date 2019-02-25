package cn.csdas.yelf.ioc.beanCreate;

public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("Bean3Factory的方法执行了。。。");
        return new Bean3();
    }
}
