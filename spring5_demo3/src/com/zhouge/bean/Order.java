package com.zhouge.bean;

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
public class Order {
    private String oName ;

    public  Order(){
        System.out.println("第一步:无参构造器,创建实例对象");
    }

    public void setoName(String oName){
        this.oName = oName;
        System.out.println("第二步:调用set方法 ");
    }

    public void initMethod(){
        System.out.println("第四步:调用bean的初始化方法");
    }

    public void destoryMethod(){
        System.out.println("第七步:调用bean的初始化方法");
    }





}
