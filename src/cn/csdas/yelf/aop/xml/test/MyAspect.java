package cn.csdas.yelf.aop.xml.test;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
    public void before(){
        System.out.println("前置通知...");
    }

    public void after(){
        System.out.println("后置通知...");
    }
}
