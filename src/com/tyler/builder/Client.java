package com.tyler.builder;

public class Client {
    public static void main(String[] args) {
        Computer.Builder computerBuilder = new Computer.Builder();
        Computer computer = computerBuilder
                .builderCpu("i5")
                .builderMouse("罗技")
                .builderMonitor("三星")
                .builderKeyboard("雷蛇")
                .build();
        System.out.println(computer);
    }
}
