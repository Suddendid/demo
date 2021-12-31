package com.tyler.staticProxy;

public class Client {
    public static void main(String[] args) {
        ManSinger singer = new Proxy("周杰伦");
        singer.sing();
    }
}
