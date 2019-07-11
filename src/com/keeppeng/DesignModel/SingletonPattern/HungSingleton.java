package com.keeppeng.DesignModel.SingletonPattern;

/**
 * 恶汉式单例模式
 * 
 * @author keeppeng
 * @date 2019年7月11日 上午9:19:07
 */
public class HungSingleton {

	private static HungSingleton instance = new HungSingleton();

	private HungSingleton() {
	}

	public static HungSingleton getInstance() {
		return instance;
	}
}
