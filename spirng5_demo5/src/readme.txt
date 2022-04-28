package com.zhouge.aop;

import com.zhouge.dao.UserDao;
import com.zhouge.dao.impl.UserDaoImpl;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy  {

    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};

        //        //使用匿名内部类
        //        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
        //            @Override
        //            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //                return null;
        //            }
        //        });


        //创建一个userDaoProxy代理对象
        UserDaoImpl userDaoImpl  = new UserDaoImpl();

        //newProxyInstance()方法会返回一个代理对象
        UserDao userDao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImpl));
        int res = userDao.add(1, 2);
        System.out.println("方法被执行: "+res);

    }
}

/**
 * 创建代理对象代码
 */
class UserDaoProxy implements InvocationHandler{

    //通过有参构造器,将需要增强的方法类传递进来
    private Object obj ;
    public UserDaoProxy (Object obj){
        this.obj = obj ;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法执行之前
        System.out.println("方法执行前: "+method.getName()+"方法被执行");

        //被增强方法执行invoke()
        Object res = method.invoke(obj, args);

        //方法执行之后
        System.out.println("方法执行后: "+obj);

        return res;
    }
}

