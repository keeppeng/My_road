package com.keeppeng.DesignModel.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟快餐店的打包套餐
 * 
 * @author keeppeng
 * @date 2019年7月12日 上午11:08:17
 */
public class PackageFood {

	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float totalPrice() {
		float totalprice = 0.0f;
		for (Item item : items) {
			totalprice += item.price();
		}
		return totalprice;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}
