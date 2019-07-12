package com.keeppeng.DesignModel.BuilderPattern;

/**
 * 定义一个类目的接口，包括名字/打包方式/价格
 * 
 * @author keeppeng
 * @date 2019年7月12日 上午10:49:36
 */
public interface Item {

	public String name();

	public Packing packing();

	public float price();
}
