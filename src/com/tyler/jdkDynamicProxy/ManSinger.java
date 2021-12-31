package com.tyler.jdkDynamicProxy;

public class ManSinger implements Singer {
    private String name;
    private String location;
    public ManSinger(String name,String location) {
    this.name = name;
    this.location = location;
    }
    @Override
    public void sing() {
        System.out.println(this.name+"在"+this.location+"唱歌");
    }
}
