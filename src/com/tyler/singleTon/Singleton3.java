package com.tyler.singleTon;

/*懒汉式*/
/*推荐写法，通过静态内部类*/
public class Singleton3 {
    private Singleton3(){

    }
    public static Singleton3 getInstance(){
        return SingletonHolder.INSTANCE;
    }
    private static class SingletonHolder{
        private static final Singleton3 INSTANCE = new Singleton3();
    }
}
