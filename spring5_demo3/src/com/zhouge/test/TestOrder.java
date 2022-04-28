package com.zhouge.test;

import com.zhouge.bean.Order;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的生命周期
 * (1)通过无参构造器创建bean实例(无参构造器)
 * (2)为bean的属性设置属性值和对其他bean的引用(set()方法)
 * (3)初始化前调用bean的后置方法
 * (4)调用bean的初始化方法(需手动配置init-method)
 * (5)初始化后调用bean的后置方法
 * (6)使用bean
 * (7)关闭IoC容器后,调用销毁方法(需手动配置destory-method)
 */
public class TestOrder {

    @Test
    public void testOrder(){

        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("springTest.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("第六步:使用bean");
        context.close();//手动配置,关闭ioc容器,销毁bean对象

    }

}
