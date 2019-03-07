package cn.csdas.yelf.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    @Test
    public void demo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/test/IOCApplicationContext.xml");
        Dog animal = (Dog)ac.getBean("animal");
        animal.eat();
        System.out.println(animal);
    }
}
