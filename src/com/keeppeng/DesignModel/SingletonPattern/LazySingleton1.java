package com.keeppeng.DesignModel.SingletonPattern;

/**
 * 单例模式实现1： 懒汉式 线程不安全 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁
 * synchronized，所以严格意义上它并不算单例模式。 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作
 * 
 * @author keeppeng
 * @date 2019年7月11日 上午9:10:21
 */
public class LazySingleton1 {

	private static LazySingleton1 instance;

	private LazySingleton1() {
	}

	/**
	 * 懒汉式单例模式要想实现线程安全可以在如下获得实例的公有方法添加synchronized 关键字
	 * 
	 * @return
	 */
	public static LazySingleton1 getInstance() {
		if (instance == null) {
			instance = new LazySingleton1();
		}
		return instance;
	}
}
