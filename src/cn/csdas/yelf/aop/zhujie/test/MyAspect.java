package cn.csdas.yelf.aop.zhujie.test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

    @Before(value = "pointcut1()")
    public void before(){
        System.out.println("前置增强..");
    }

    @After(value = "pointcut2()")
    public void after(){
        System.out.println("最终增强...");
    }

    @Pointcut(value = "execution(* cn.csdas.yelf.aop.zhujie.test.EmpDaoImpl.select(..))")
    public void pointcut1(){}

    @Pointcut(value = "execution(* cn.csdas.yelf.aop.zhujie.test.EmpDaoImpl.save(..))")
    public void pointcut2(){}
}
