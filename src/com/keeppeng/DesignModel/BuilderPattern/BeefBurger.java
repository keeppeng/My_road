package com.keeppeng.DesignModel.BuilderPattern;

public class BeefBurger extends Burger {

	@Override
	public String name() {
		return "巨无霸牛肉汉堡";
	}

	@Override
	public float price() {
		return 10f;
	}

}
