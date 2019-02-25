package cn.csdas.yelf.ioc.zhujieandxml;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void demo1(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/zhujieandxml/config.xml");
        Dog dog = (Dog)beanFactory.getBean("dog");
        System.out.println(dog.cry());
        System.out.println(dog.getName());
    }
}
