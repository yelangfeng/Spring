package cn.csdas.yelf.aop.zhujie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aopAnnoConfig.xml")
public class SpringDemo {
    @Autowired
    @Qualifier("orderDao")
    private OrderDao orderDao;

    @Test
    public void demo1(){
        orderDao.save();
        orderDao.delete();
        orderDao.update();
        orderDao.find();
    }
}
