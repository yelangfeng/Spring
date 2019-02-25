package cn.csdas.yelf.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 */
public class MyAspectXML {
    /**
     *    前置通知：切入点执行前通知
     */
    public void checkPri(JoinPoint joinPoint){
        System.out.println("权限校验..."+joinPoint);
    }
    /**
     *    后置通知：切入点执行后执行，可以输出切入点的返回值
     */
    public void checkResult(Object result){
        System.out.println("结果检查..."+result);
    }
    /**
     * 环绕通知：切入点执行前后执行
     */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        //切入点执行前执行
        System.out.println("环绕前通知...");
        Object obj = joinPoint.proceed();
        //切入点执行后执行
        System.out.println("环绕后通知...");
        return obj;
    }
    /**
     *异常抛出通知:切入点发生异常时执行
     */
    public void afterThrowing(Throwable ex){
        System.out.println("异常抛出通知..."+ex.getMessage());
    }

    /**
     * 最终执行：切入点执行完毕后一定会执行（无论是否有异常），类似finally代码块
     */
    public void after(){
        System.out.println("最终通知...");
    }
}
