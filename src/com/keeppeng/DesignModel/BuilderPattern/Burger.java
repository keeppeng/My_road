package com.keeppeng.DesignModel.BuilderPattern;

/**
 * 汉堡的抽象类
 * 
 * @author keeppeng
 * @date 2019年7月12日 上午10:55:24
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}
