package com.tyler.cglibDynamicProxy;

import com.tyler.jdkDynamicProxy.Singer;

public class ManSinger{
    private String name;
    private String location;

    public ManSinger() {
    }

    public ManSinger(String name, String location) {
    this.name = name;
    this.location = location;
    }
    public void sing() {
        System.out.println(this.name+"在"+this.location+"唱歌");
    }
}
