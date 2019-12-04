package cn.csdas.yelf.aop.xml.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before(){
        System.out.println("前置通知...");
    }

    public void after(){
        System.out.println("后置通知...");
    }

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知...");
        joinPoint.proceed();
        System.out.println("环绕后通知...");
    }

    public void exception(){
        System.out.println("抛出异常后通知...");
    }

}
