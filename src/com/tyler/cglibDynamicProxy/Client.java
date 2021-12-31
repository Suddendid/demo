package com.tyler.cglibDynamicProxy;

import com.tyler.staticProxy.iter.Singer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args){
        ManSinger singer = new ManSinger("薛之谦","上海");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ManSinger.class);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("经纪人接活");
                method.invoke(singer);
                System.out.println("经纪人结款");
                return null;
            }
        });
        ManSinger singerEnhance = (ManSinger)enhancer.create();
        singerEnhance.sing();
    }
}
