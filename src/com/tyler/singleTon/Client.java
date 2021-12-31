package com.tyler.singleTon;

public class Client {
    public static void main(String[] args) {
        /*Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        Singleton instance4 = Singleton.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1==instance3);
        System.out.println(instance1==instance4);*/

        /*Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        Singleton2 instance3 = Singleton2.getInstance();
        Singleton2 instance4 = Singleton2.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1==instance3);
        System.out.println(instance1==instance4);*/

        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        Singleton3 instance3 = Singleton3.getInstance();
        Singleton3 instance4 = Singleton3.getInstance();
        System.out.println(instance1==instance2);
        System.out.println(instance1==instance3);
        System.out.println(instance1==instance4);
    }
}
