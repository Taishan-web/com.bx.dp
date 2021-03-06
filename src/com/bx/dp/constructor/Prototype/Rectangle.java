package com.bx.dp.constructor.Prototype;

public class Rectangle extends Shape {
   public Rectangle(){
     type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
