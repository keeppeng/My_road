package com.keeppeng.DesignModel.FactoryPattern;

/**
 * 这是一个工厂类，根据传入的不同的想要创建的对象名的不一样，来创建不同的实例
 * 
 * @author keeppeng
 * @date 2019年7月8日 下午2:24:35
 */
public class ShapeFactory {

	// 传入值不同，就返回不同的Shape的子类对象
	public Shape getShape(String shapeType) {
		// 当传值为null或者空字符串的时候不返回任何对象
		if (shapeType == null || shapeType.equalsIgnoreCase("")) {
			return null;
		} else {
			// 这里可以优化，将传值直接 toUpperCase，或者toLowerCase，转换成大写或者小写，后续case可以更加方便的判断：
			switch (shapeType) {
			case "CIRCLE":
			case "Circle":
				return new Circle();
			case "RECTANGLE":
			case "Rectangle":
				return new Rectangle();
			case "SQUARE":
			case "Square":
				return new Square();
			}
			return null;
		}

	}
}
