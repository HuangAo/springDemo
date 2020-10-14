package com.huang.log;

/**
 * 自定义的切面，没有实现任何Spring接口
 * @author :huangao
 */
public class Log2 {

    public void beforeLog(){
        System.out.println("记录日志2: 方法执行前===============");
    }

    public void aftertLog(){
        System.out.println("记录日志2: 方法执行后===============");
    }
}
