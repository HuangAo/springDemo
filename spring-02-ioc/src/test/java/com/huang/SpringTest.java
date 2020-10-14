package com.huang;

import com.huang.pojo.Student;
import com.huang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :huangao
 */
public class SpringTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User)context.getBean("user");
//        user.show();
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
