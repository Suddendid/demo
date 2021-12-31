package com.tyler.staticProxy;

public class Proxy extends ManSinger {
    public Proxy(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("经纪人接活");
        super.sing();
        System.out.println("结交尾款");
    }
}
