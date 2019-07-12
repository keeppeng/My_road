package com.keeppeng.DesignModel.BuilderPattern;

/**
 * 构建套餐
 * 
 * @author keeppeng
 * @date 2019年7月12日 上午11:15:16
 */
public class PackageMealBuilder {

	public PackageFood juwuba() {
		PackageFood paFood = new PackageFood();
		paFood.addItem(new BeefBurger());
		paFood.addItem(new Pepsi());
		System.out.println("超级巨无霸套餐已经就绪");
		return paFood;
	}

	public PackageFood maixiangji() {
		PackageFood paFood = new PackageFood();
		paFood.addItem(new ChickenBurger());
		paFood.addItem(new IceCola());
		System.out.println("麦香鸡腿堡套餐已经就绪");
		return paFood;
	}
}
