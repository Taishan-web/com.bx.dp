package com.bx.dp.constructor.builder;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
       return new Bottle();
    }
}
