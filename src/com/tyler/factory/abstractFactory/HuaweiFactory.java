package com.tyler.factory.abstractFactory;

public class HuaweiFactory extends AbstractFactory{
    @Override
    AbstractPC productPC() {
        return new MateBookPro();
    }

    @Override
    AbstractPhone productPhone() {
        return new Mate50();
    }
}
