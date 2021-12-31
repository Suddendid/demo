package com.tyler.singleTon;

/*懒汉式*/
/*（线程不安全）*/
public class Singleton2 {
    //单例设计模式
    private static Singleton2 INSTANCE;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}
