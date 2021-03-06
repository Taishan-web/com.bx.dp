package com.bx.dp.Creational.abstractFactory;

import com.bx.dp.Creational.factory.*;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape) ;
}
