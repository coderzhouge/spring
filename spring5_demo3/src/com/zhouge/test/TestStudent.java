package com.zhouge.test;

import com.zhouge.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void testStudent(){
        //基于xml方式注入集合类型属性
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Student student = context.getBean("student", Student.class);
        student.test();

    }

    @Test
    public void testStudent2(){
        //基于xml方式注入集合对象类型属性
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Student student2 = context.getBean("student2", Student.class);
        student2.testCourse();
    }

    @Test
    public void testExtract(){
        //基于xml方式提取可复用的属性
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Student student3 = context.getBean("student3", Student.class);
        student3.testScore();
    }




}
