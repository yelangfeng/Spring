package cn.csdas.yelf.ioc.beanCreate;

public class Bean2Factory {
    public static Bean2 createBean2(){
        System.out.println("Bean2Factory方法执行了。。。");
        return new Bean2();
    }
}
