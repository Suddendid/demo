package com.tyler.factory.simple;

public class Client {
    public static void main(String[] args) {
        HuaweiPhoneFactory factory = new HuaweiPhoneFactory();
        HuaweiPhone p50 = factory.product("p50");
        p50.call();
    }
}
