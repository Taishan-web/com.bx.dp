package com.bx.dp.Creational.builder;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
       return new Bottle();
    }
}
