package com.keeppeng.DesignModel.SingletonPattern;

/**
 * 登记式/静态内部类
 * 
 * @author keeppeng
 * @date 2019年7月11日 上午9:37:03
 */
public class StaticInnerSingleton {

	private static class SingletonHolder {
		private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
	}

	private StaticInnerSingleton() {
	}

	public static final StaticInnerSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
