package com.zhouge.test;

import com.zhouge.autowire.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

    @Test
    public void testAutoWire(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springTest.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
    }
}
