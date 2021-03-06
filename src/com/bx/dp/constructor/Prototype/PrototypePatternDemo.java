package com.bx.dp.constructor.Prototype;

public class PrototypePatternDemo {
   public static void main(String[] args) {
      ShapeCache.loadCache();

      Shape clonedShape = (Shape) ShapeCache.getShape("circle");
      System.out.println("Shape : " + clonedShape.getType());       

      clonedShape = (Shape) ShapeCache.getShape("square");
      System.out.println("Shape : " + clonedShape.getType());        

      clonedShape = (Shape) ShapeCache.getShape("rectangle");
      System.out.println("Shape : " + clonedShape.getType());     
      
      clonedShape = (Shape) ShapeCache.getShape("circle");
      System.out.println("Shape : " + clonedShape.getType());       

      clonedShape = (Shape) ShapeCache.getShape("square");
      System.out.println("Shape : " + clonedShape.getType());        

      clonedShape = (Shape) ShapeCache.getShape("rectangle");
      System.out.println("Shape : " + clonedShape.getType());  
      
   }
}
