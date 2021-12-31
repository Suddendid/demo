package com.tyler.staticProxy;

public class ManSinger {
    private String name;

    public ManSinger(String name) {
        this.name = name;
    }

    public void sing(){
        System.out.println(name+"在唱歌");
    }
}
