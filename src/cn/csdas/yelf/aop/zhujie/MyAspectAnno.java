package cn.csdas.yelf.aop.zhujie;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 * @author yelf
 */
@Aspect
public class MyAspectAnno {

    //前置通知
    @Before(value = "pointcut1()")
    public void before(){
        System.out.println("前置增强...........");
    }

    //后置通知
    @AfterReturning(value = "pointcut2()",returning = "result")
    public void afterReturning(Object result){
        System.out.println("后置通知............"+result);
    }


    //环绕增强
    @Around(value = "pointcut3()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕增强前.........");
        Object obj = joinPoint.proceed();
        System.out.println("环绕增强后.........");
        return obj;
    }

    //异常增强
    @AfterThrowing(value = "pointcut4()",throwing = "ex")
    public void afterThrowing(Throwable ex){
        System.out.println("异常抛出通知.........."+ex.getMessage());
    }

    //最终增强
    @After(value = "pointcut5()")
    public void after(){
        System.out.println("最终增强...........");
    }

    //切入点注解
    @Pointcut(value = "execution(* cn.csdas.yelf.aop.zhujie.OrderDao.find(..))")
    public void pointcut1(){}

    @Pointcut(value = "execution(* cn.csdas.yelf.aop.zhujie.OrderDao.delete(..))")
    public void pointcut2(){}

    @Pointcut(value = "execution(* cn.csdas.yelf.aop.zhujie.OrderDao.save(..))")
    public void pointcut3(){}

    @Pointcut(value = "execution(* cn.csdas.yelf.aop.zhujie.OrderDao.*(..))")
    public void pointcut4(){}

    @Pointcut(value = "execution(* cn.csdas.yelf.aop.zhujie.OrderDao.delete(..))")
    public void pointcut5(){}
}
