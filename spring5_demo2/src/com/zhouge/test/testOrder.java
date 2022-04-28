package com.zhouge.test;

import com.zhouge.bean.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testOrder {
    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        Order order = context.getBean("order", Order.class);
        order.testOrder();
    }
}
