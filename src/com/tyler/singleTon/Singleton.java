package com.tyler.singleTon;
/*饿汉式*/
/*（线程安全）*/
public class Singleton {
    //单例设计模式
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){

    }
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
