package com.keeppeng.DesignModel.SingletonPattern;

/**
 * 单例模式
 * 
 * @author keeppeng
 * @date 2019年7月11日 上午8:59:48
 */
public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingleObject.getInstance().print();
		LazySingleton1.getInstance();
	}
}

class SingleObject {
	// 静态加载时创建实例对象
	private static SingleObject instance = new SingleObject();

	// 私有构造方法
	private SingleObject() {
	}

	// 对外公开的获取实例的方法
	public static SingleObject getInstance() {
		return instance;
	}

	public void print() {
		System.out.println("实现单例模式");
	}
}