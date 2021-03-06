package com.bx.dp.constructor.builder;

public abstract class Burger implements Item {
   @Override
   public Packing packing() {
      return new Wrapper();
   }
}
