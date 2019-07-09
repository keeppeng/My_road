package com.keeppeng.DesignModel.AbsFactoryPattern;

import com.keeppeng.DesignModel.FactoryPattern.Shape;

public class AbsFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory colorfactory = FactoryBuilder
				.getAbstractFactory("Color");
		Color color = colorfactory.getColor("red");
		color.fill();

		AbstractFactory shapeFactory = FactoryBuilder
				.getAbstractFactory("shape");
		Shape shape = shapeFactory.getShape("circle");
		shape.draw();

		// 测试健壮性
		AbstractFactory factory = FactoryBuilder.getAbstractFactory("shape");
		Color color2 = factory.getColor("red");
		color2.fill();
	}
}
