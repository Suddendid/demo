package com.tyler.staticProxy.iter;

public class Client {
    public static void main(String[] args) {
        //实现同一接口的代理
        Singer singer = new ManSinger("周杰伦");
        Singer manSinger = new Proxy(singer);
        manSinger.sing();
    }
}
