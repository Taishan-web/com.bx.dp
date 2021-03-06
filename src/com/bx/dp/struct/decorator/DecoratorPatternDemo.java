package com.bx.dp.struct.decorator;

import com.bx.dp.constructor.factory.Circle;
import com.bx.dp.constructor.factory.Rectangle;
import com.bx.dp.constructor.factory.Shape;
import com.bx.dp.constructor.factory.Square;

public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	  
      Shape redSquare = new RedShapeDecorator(new Square());
      
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
      
      System.out.println("\nSquare of red border");
      redSquare.draw();
   }
}
