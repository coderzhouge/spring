package com.zhouge.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    /**
     * 通知类型：
     *  前置通知@before
     *  返回通知@afterReturning
     *  环绕通知@around
     *  异常通知@afterThrowing
     *  最终通知@after
     */

    //前置通知
    @Before(value = "execution(* com.zhouge.bean.User.add(..))")
    public void before(){
        System.out.println("UserProxy:before() ...");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "execution(* com.zhouge.bean.User.add())")
    public void afterReturn(){
        System.out.println("UserProxy:afterReturn() ...");
    }

    //环绕通知
    @Around(value = "execution(* com.zhouge.bean.User.add())")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("UserProxy:around() before...");
        proceedingJoinPoint.proceed();
        System.out.println("UserProxy:around() after...");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.zhouge.bean.User.add())")
    public void afterThrowing(){
        System.out.println("UserProxy:afterThrowing() ...");
    }

    //最终通知
    @After(value = "execution(* com.zhouge.bean.User.add())")
    public void after(){
        System.out.println("UserProxy:after() ...");
    }

}
