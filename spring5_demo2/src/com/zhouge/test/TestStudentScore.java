package com.zhouge.test;

import com.zhouge.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentScore {
    @Test
    public void testStudentScore(){

        //级联赋值
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Student studentScore = context.getBean("studentScore", Student.class);
        studentScore.testStuScore();

    }
}
