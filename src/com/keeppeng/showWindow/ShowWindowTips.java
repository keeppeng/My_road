package com.keeppeng.showWindow;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author keeppeng
 * @date 2019��5��21�� ����2:35:21
 * 
 *       ������ʾ����Ĳ�����eg������A ���� A
 * 
 *       ����Quit ���˳�ϵͳ�������
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
				// JOptionPane.showMessageDialog(null, "����Ϊ�����û������");
				// JOptionPane.showMessageDialog(null, "�㻹��̫�����˰���");
				// JOptionPane.showMessageDialog(null, "���Ǹ���ѭ����������");
				// JOptionPane.showMessageDialog(null, "���ˣ���������");
				// JOptionPane.showMessageDialog(null, "����һ����·");

			}
		}
	}

}
