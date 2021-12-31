package com.tyler.factory.abstractFactory;

public class MiFactory extends AbstractFactory{
    @Override
    AbstractPC productPC() {
        return new MiBookPro();
    }

    @Override
    AbstractPhone productPhone() {
        return new MI12();
    }
}
