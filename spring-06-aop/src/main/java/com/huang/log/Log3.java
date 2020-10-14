package com.huang.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author :huangao
 */
@Aspect
public class Log3 {

    @Before("execution(* com.huang.service.UserServiceImpl.*(..))")
    public void beforeLog3(){
        System.out.println("记录日志3: 方法执行前===============");
    }


    @After("execution(* com.huang.service.UserServiceImpl.*(..))")
    public void afterLog3(){
        System.out.println("记录日志3: 方法执行后===============");
    }
}
