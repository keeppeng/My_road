package com.keeppeng.DesignModel.AbsFactoryPattern;

import com.keeppeng.DesignModel.FactoryPattern.Circle;
import com.keeppeng.DesignModel.FactoryPattern.Rectangle;
import com.keeppeng.DesignModel.FactoryPattern.Shape;
import com.keeppeng.DesignModel.FactoryPattern.Square;

/**
 * 创建形状工厂类，目的就是根据不同的传入的形状要求来创建不同的实例
 * 
 * @author keeppeng
 * @date 2019年7月9日 上午9:22:36
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String ColorName) {
		return null;
	}

	@Override
	public Shape getShape(String ShapeName) {
		// 非空判断
		if (ShapeName == null || ShapeName.equals("")) {
			System.err.println("请输入非空参数！");
			return null;
		} else {
			// 转换成大写使用switch
			ShapeName = ShapeName.toUpperCase();
			switch (ShapeName) {
			case "CIRCLE":
				return new Circle();
			case "SQUARE":
				return new Square();
			case "RECTANGLE":
				return new Rectangle();
			}
			return null;
		}
	}

}
