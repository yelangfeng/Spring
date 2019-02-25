package cn.csdas.yelf.ioc.property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void demo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/property/beans.xml");
        Car car1 = (Car)ac.getBean("car1");
        System.out.println(car1);
    }

    @Test
    public void demo2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/property/beans.xml");
        Cat cat1 = (Cat)ac.getBean("car2");
        System.out.println(cat1);
    }

    @Test
    public void demo3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/property/beans.xml");
        Employee emp = (Employee)ac.getBean("emp");
        System.out.println(emp);
    }

    @Test
    public void demo4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/property/beans.xml");
        Employee emp1 = (Employee)ac.getBean("emp1");
        System.out.println(emp1);
    }

    @Test
    public void demo5(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/property/beans.xml");
        Cat car3 = (Cat)ac.getBean("car3");
        System.out.println(car3);
    }

    @Test
    public void demo6(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/property/beans.xml");
        Employee emp = (Employee)ac.getBean("emp2");
        System.out.println(emp.getCar()+emp.getName());
    }
}
