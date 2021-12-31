package com.tyler.jdkDynamicProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException {
        //参数1：当前ClassLoader
        //参数2：当前需要代理对象实现的接口
        //参数3：InvocationHandler
        String className = "com.tyler.jdkDynamicProxy.ManSinger";
        Class<?> aClass = Class.forName(className);
        Object proxy = Proxy.newProxyInstance(aClass.getClassLoader()
                , aClass.getInterfaces()
                , new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("打印日志--before");
                        Constructor<?> constructor = aClass.getConstructor(String.class,String.class);
                        method.invoke(constructor.newInstance("陈奕迅","南京"));
                        System.out.println("打印日志--after");
                        return null;
                    }
                });
        Singer singer1 = (Singer) proxy;
        singer1.sing();
    }
}
