package com.keeppeng.ComparePython;

import java.util.Scanner;

public class CompareDemo {
	public static void main(String[] args) {
		System.out.print("请输入你的名字：");
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String name = scanner.next();
			System.out.println("欢迎你啊" + name + "大佬");
			if (name.equals("塞塞")) {
				System.out.println("原来你是" + name + "啊，久仰大名，久仰大名！");
				System.exit(0);
			} else {
				System.out.println(name + "是谁啊，不认识");
				System.exit(0);
			}
		}
	}
}
