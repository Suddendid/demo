package com.tyler.factory.factory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new P50Factory();
        HuaweiPhone p50 = factory.product();
        p50.call();
    }
}
