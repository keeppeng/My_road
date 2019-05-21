package com.keeppeng.showWindow;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author keeppeng
 * @date 2019年5月21日 下午2:35:21
 * 
 *       弹框显示输入的参数；eg：输入A 弹框 A
 * 
 *       输入Quit 则退出系统运行完成
 */
public class ShowWindowTips {

	public static void main(String[] args) {
		while (true) {
			System.out.print("input...:");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();
			if (s.equalsIgnoreCase("quit")) {
				System.out.print("Process Over...");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, s);
				// JOptionPane.showMessageDialog(null, "你以为点掉就没事了吗？");
				// JOptionPane.showMessageDialog(null, "你还是太年轻了啊！");
				// JOptionPane.showMessageDialog(null, "这是个死循环看不懂吗？");
				// JOptionPane.showMessageDialog(null, "算了，不逗你了");
				// JOptionPane.showMessageDialog(null, "放你一条生路");

			}
		}
	}

}
