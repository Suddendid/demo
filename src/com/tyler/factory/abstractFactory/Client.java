package com.tyler.factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new HuaweiFactory();
        AbstractPC pc = factory.productPC();
        System.out.println(pc);
    }
}
