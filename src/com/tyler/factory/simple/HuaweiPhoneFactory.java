package com.tyler.factory.simple;

public class HuaweiPhoneFactory {
    public HuaweiPhone product(String phoneName){
        if(phoneName.equalsIgnoreCase("p50")){
            return new P50();
        }else if(phoneName.equalsIgnoreCase("mate50")){
            return new Mate50();
        }else {
            throw new RuntimeException("手机型号不存在");
        }
    }
}
