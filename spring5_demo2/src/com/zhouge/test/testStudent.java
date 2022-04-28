package com.zhouge.test;

import com.zhouge.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStudent {
    @Test
    public void testStudent(){

        //使用p名称空间注入属性
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Student student = context.getBean("pStudent", Student.class);
        student.testStu();

    }
}
