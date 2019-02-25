package cn.csdas.yelf.ioc.collection;

import cn.csdas.yelf.ioc.property.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

public class Demo {
    @Test
    public void demo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/collection/applicationContext.xml",
                "cn/csdas/yelf/ioc/property/beans.xml");
        School school = (School)ac.getBean("school");
        System.out.println(school.getName());
        System.out.println(school.getArrs()[2]);
        System.out.println(school.getList().get(1));
        System.out.println(school.getMap().get("c"));
        Iterator<String> it = school.getSet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Car car = (Car)ac.getBean("car1");
        System.out.println(car);
    }
}
