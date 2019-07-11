package com.keeppeng.DesignModel.SingletonPattern;

/**
 * 双重校验锁
 * 
 * @author keeppeng
 * @date 2019年7月11日 上午9:21:51
 */
public class DCL_Singleton {

	private volatile static DCL_Singleton instance;

	private DCL_Singleton() {
	}

	public static DCL_Singleton getInstance() {
		synchronized (DCL_Singleton.class) {
			if (instance == null) {
				instance = new DCL_Singleton();
			}
		}
		return instance;
	}
}
