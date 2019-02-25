package cn.csdas.yelf.transaction.two;

import cn.csdas.yelf.transaction.two.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/csdas/yelf/transaction/two/transaction.xml")
public class SpringDemo {
    @Resource(name="accountService")
    private AccountService accountService;
    @Test
    public void demo1(){
        accountService.transfer("xuan","yelf",888);
    }
}
