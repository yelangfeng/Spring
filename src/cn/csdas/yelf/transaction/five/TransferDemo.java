package cn.csdas.yelf.transaction.five;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransferDemo {
    @Test
    public void demo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/csdas/yelf/transaction/five/transaction.xml");
        AccountService accountService = (AccountService)ac.getBean("accountService");
        accountService.transfer("xuan","yelf",211);
    }
}
