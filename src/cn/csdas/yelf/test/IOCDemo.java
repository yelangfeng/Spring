package cn.csdas.yelf.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCDemo {

    @Test
    public void demo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/test/IOCDemo.xml");
        Dog animal = (Dog)ac.getBean("animal");
        animal.eat();
    }

    @Test
    public void demo2(){
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/cn/csdas/yelf/test/IOCDemo.xml");
        Dog animal = (Dog)ac.getBean("animal");
        animal.eat();
    }
}
