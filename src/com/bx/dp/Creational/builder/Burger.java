package com.bx.dp.Creational.builder;

public abstract class Burger implements Item {
   @Override
   public Packing packing() {
      return new Wrapper();
   }
}
