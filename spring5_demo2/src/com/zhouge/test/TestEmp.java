package com.zhouge.test;

import com.zhouge.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    @Test
    public void testEmp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.testEmp();
    }
}

