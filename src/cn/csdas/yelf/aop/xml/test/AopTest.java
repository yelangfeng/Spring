package cn.csdas.yelf.aop.xml.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/cn/csdas/yelf/aop/xml/test/aopConfig.xml")
public class AopTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void demo1(){
        userDao.save();
    }
}
