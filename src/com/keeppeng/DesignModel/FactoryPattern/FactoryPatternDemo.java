package com.keeppeng.DesignModel.FactoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// 创建工厂对象
		ShapeFactory factory = new ShapeFactory();

		// 传入参数获取想要创建的对象
		Shape shape = factory.getShape("Square");
		shape.draw();
	}
}
