package com.hkw.spring5.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 切面
@Component
@Aspect // 生成代理对象
@Order(1)
public class StudentProxy {

    // 抽取相同的切入点表达式(使用@Pointcut)
    @Pointcut(value = "execution(* com.hkw.spring5.proxy.Student.add(..))")
    public static void pointcut() {};

    // 前置通知
    @Before("pointcut()")
    public void before() {
        System.out.println("before ... ");
    }

    // 后置通知
    @After("pointcut()")
    public void after() {
        System.out.println("after ... ");
    }

    // 返回结果通知
    @AfterReturning("pointcut()")
    public void afterReturning() {
        System.out.println("afterReturning ... ");
    }

    // 环绕通知
    @Around("pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around 环绕之前 ... ");
        proceedingJoinPoint.proceed();
        System.out.println("around 环绕之后 ... ");
    }

    // 异常通知
    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing ... ");
    }
}
