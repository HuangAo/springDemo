package com.huang;

import com.huang.config.AppConfig;
import com.huang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author :huangao
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User)context.getBean("user");
        System.out.println(user);
    }
}
