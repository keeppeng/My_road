package com.keeppeng.DesignModel.AbsFactoryPattern;

import com.keeppeng.DesignModel.FactoryPattern.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String ColorName) {
		if (ColorName == null || ColorName.equals("")) {
			System.err.println("请输入非空参数");
			return null;
		} else {
			ColorName = ColorName.toUpperCase();
			switch (ColorName) {
			case "RED":
				return new Red();
			case "YELLOW":
				return new Yellow();
			case "BLUE":
				return new Blue();
			}
			return null;
		}
	}

	@Override
	public Shape getShape(String ShapeName) {
		return null;
	}
}
