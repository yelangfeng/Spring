package cn.csdas.yelf.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCDemo {

    //xml配置
    @Test
    public void demo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/test/IOCDemo.xml");
        Dog animal = (Dog)ac.getBean("animal");
        animal.eat();
        System.out.println(animal);
        Dog animal1 = (Dog)ac.getBean("animal");
        System.out.println(animal1);
        ((ClassPathXmlApplicationContext) ac).close();
    }

    @Test
    public void demo2(){
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/cn/csdas/yelf/test/IOCDemo.xml");
        Dog animal = (Dog)ac.getBean("animal");
        animal.eat();
    }


    //注解
    @Test
    public void demo4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/test/IOCDemo1.xml");
        Host1 host1 = (Host1)ac.getBean("host1");
        System.out.println(host1);
        Dog1 dog1 = (Dog1)ac.getBean("dog1");
        System.out.println(dog1);
    }
}
