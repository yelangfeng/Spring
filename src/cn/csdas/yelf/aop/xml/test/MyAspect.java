package cn.csdas.yelf.aop.xml.test;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知..."+joinPoint);
    }
}
