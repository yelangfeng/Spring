package cn.csdas.yelf.ioc.beanCreate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void testBean1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/beanCreate/beans.xml");
        Bean1 bean1 = (Bean1) ac.getBean("bean1");
    }

    @Test
    public void testBean2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/beanCreate/beans.xml");
        Bean2 bean2 = (Bean2) ac.getBean("bean2");
    }

    @Test
    public void testBean3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/beanCreate/beans.xml");
        Bean3 bean3 = (Bean3) ac.getBean("bean3");
    }
}
