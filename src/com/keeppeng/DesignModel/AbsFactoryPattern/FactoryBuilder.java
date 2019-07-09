package com.keeppeng.DesignModel.AbsFactoryPattern;

public class FactoryBuilder {

	public static AbstractFactory getAbstractFactory(String choice) {
		if (choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		} else {
			System.err.println("请选择合适的工厂类");
			return null;
		}
	}
}
