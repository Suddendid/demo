package com.tyler.staticProxy.iter;

public class ManSinger implements Singer{
    private String name;
    public ManSinger(String name) {
    this.name = name;
    }
    @Override
    public void sing() {
        System.out.println(this.name+"在唱歌");
    }
}
