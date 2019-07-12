package com.keeppeng.DesignModel.BuilderPattern;

public class DemoSold {

	public static void main(String[] args) {
		TCjuwuba();
		// PackageMealBuilder builder = new PackageMealBuilder();

	}

	private static void TCjuwuba() {
		PackageMealBuilder builder = new PackageMealBuilder();
		PackageFood juwuba = builder.juwuba();
		juwuba.addItem(new IceCola());
		float totalPrice = juwuba.totalPrice();
		System.out.println("总价：" + totalPrice);
		juwuba.showItems();
	}
}
