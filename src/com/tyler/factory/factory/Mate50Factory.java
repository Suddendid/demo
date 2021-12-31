package com.tyler.factory.factory;

public class Mate50Factory implements Factory{
    @Override
    public HuaweiPhone product() {
        return new Mate50();
    }
}
