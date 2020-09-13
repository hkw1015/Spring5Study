package com.hkw.spring5.proxy;

import com.hkw.spring5.dao.UserDao;
import com.hkw.spring5.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        UserDao userDao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), new Class[]{UserDao.class},new UserDaoHandler(new UserDaoImpl()));
    }
}

// 创建代理对象的代码
class UserDaoHandler implements InvocationHandler {
    // 需要将我们要增强的类通过构造器传递进来
    private Object obj;

    public UserDaoHandler(Object obj) {
        this.obj = obj;
    }

    // invoke方法里写我们的增强代码
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法执行之前
        System.out.println("在" + method.getName() + "方法执行之前的增强代码");

        // 执行被增强的方法
        Object object = method.invoke(obj, args);

        // 方法执行之后
        System.out.println("在" + method.getName() + "方法执行之后的增强代码");

        return object;
    }
}
