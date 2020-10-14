package com.huang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 实现Spring接口的切面
 * @author :huangao
 */
public class Log implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("记录日志:"+method.getName()+"方法执行了");
    }
}
