package com.bx.dp.constructor.abstractFactory;

import com.bx.dp.constructor.factory.*;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape) ;
}
