package cn.csdas.yelf.aop.xml;

/**
 *测试类
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aopXMLConfig.xml")
public class SpringDemo {
    @Resource(name = "productDao")
    private  ProductDao productDao;

    @Test
    public void demo1(){
        productDao.save();
        productDao.delete();
        productDao.update();
        productDao.find();
    }

}
