package com.keeppeng.DesignModel.BuilderPattern;

public abstract class Cola implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

}
