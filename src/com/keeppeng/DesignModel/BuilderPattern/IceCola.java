package com.keeppeng.DesignModel.BuilderPattern;

public class IceCola extends Cola {

	@Override
	public String name() {
		return "无糖零度可乐";
	}

	@Override
	public float price() {
		return 1f;
	}

}
