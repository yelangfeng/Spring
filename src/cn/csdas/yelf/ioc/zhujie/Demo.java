package cn.csdas.yelf.ioc.zhujie;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void demo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/zhujie/applicationContext.xml");
        Aminal dog = (Dog) ac.getBean("dog");
        System.out.println(((Dog) dog).getName()+((Dog) dog).getColor());
        System.out.println(dog.cry());

        Master master = (Master)ac.getBean("master");
        System.out.println(master.getName());
        System.out.println(master.getDog().getName());
    }

    @Test
    public void demo2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/zhujie/applicationContext.xml");
        Cat cat = (Cat) ac.getBean("cat");
        System.out.println(cat.getName());
        ((ClassPathXmlApplicationContext) ac).close();
    }
}
