package cn.csdas.yelf.aop.zhujie.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/cn/csdas/yelf/aop/zhujie/test/aopConfig.xml")
public class AopDemo {
    @Autowired
    private EmpDao empDao;


    @Test
    public void demo1(){
        empDao.select();
        empDao.save();
    }
}
