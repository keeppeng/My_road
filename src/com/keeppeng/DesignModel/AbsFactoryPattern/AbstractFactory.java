package com.keeppeng.DesignModel.AbsFactoryPattern;

import com.keeppeng.DesignModel.FactoryPattern.Shape;

public abstract class AbstractFactory {

	public abstract Color getColor(String ColorName);

	public abstract Shape getShape(String ShapeName);
}
