package com.tyler.factory.factory;


public class P50Factory implements Factory{
    @Override
    public HuaweiPhone product() {
        return new P50();
    }
}
