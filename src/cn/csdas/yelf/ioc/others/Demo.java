package cn.csdas.yelf.ioc.others;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo {
    @Test
    /**
     * spring的依赖注入
     */
    public void demo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/others/applicationContext.xml");
        UserDao userDao = (UserDao)ac.getBean("userDao");
        userDao.save();
        UserDaoImpl userDao1 = (UserDaoImpl)userDao;
        System.out.println(userDao1.getName());
        UserDaoImpl userDao2 = (UserDaoImpl)ac.getBean("userDao");
        System.out.println(userDao2.getName());
    }

    /**
     * 测试spring的bean单例和多例模式
     */
    @Test
    public void demo2(){
        BeanFactory bf = new ClassPathXmlApplicationContext("cn/csdas/yelf/ioc/others/applicationContext.xml");
        System.out.println(11);
        UserDao userDao = (UserDao)bf.getBean("userDao");
        userDao.save();
        UserDao userDao1 = (UserDao)bf.getBean("userDao");
        System.out.println(userDao==userDao1);

    }

    /**
     * 测试spring的bean的声明周期
     * @author yelf
     *
     */
    @Test
    public void demo3(){
        ApplicationContext ac = new FileSystemXmlApplicationContext("./src/cn/csdas/yelf/ioc/aopXMLConfig.xml");
        System.out.println(11);
        UserDao userDao = (UserDao)ac.getBean("userDao");
        userDao.save();
        ((FileSystemXmlApplicationContext) ac).close();
    }
}
