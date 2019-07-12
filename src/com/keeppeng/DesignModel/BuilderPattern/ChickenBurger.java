package com.keeppeng.DesignModel.BuilderPattern;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "麦辣鸡腿堡";
	}

	@Override
	public float price() {
		return 12f;
	}

}
