package com.tyler.staticProxy.iter;

public class Proxy implements Singer{
    Singer singer;

    public Proxy(Singer singer) {
        this.singer = singer;
    }

    @Override
    public void sing() {
        System.out.println("经纪人接活");
        singer.sing();
        System.out.println("结交尾款");
    }
}
