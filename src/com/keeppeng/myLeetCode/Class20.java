package com.keeppeng.myLeetCode;

import java.util.ArrayList;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order. Note that an empty string is also considered
 * valid.
 * 
 * @author keeppeng
 * @date 2019��6��5�� ����9:06:29
 */
public class Class20 {
	public static void main(String[] args) {
		String inputString = "[])";
		System.out.println(check(inputString));
	}

	public static boolean check(String inputString) {
		char[] array = inputString.toCharArray();
		ArrayList solve = new ArrayList();
		for (int i = 0; i < array.length; i++) {
			// ���Ϊ���ߵ��������ţ�����ֱ�Ӽ��뼯��
			if (array[i] == '(' | array[i] == '[' | array[i] == '{') {
				solve.add(array[i]);
			} else {
				if (i > 0 & solve.size() > 0) {
					// ������ǵ�һλ������Ҫ��ǰһλ�Աȣ��ɶԳ��־��Ƴ�ǰһλ,Ȼ���������
					if ((array[i] == ')' && (char) solve.get(solve.size() - 1) == '(')
							| (array[i] == ']' && (char) solve
									.get(solve.size() - 1) == '[')
							| (array[i] == '}' && (char) solve
									.get(solve.size() - 1) == '{')) {
						solve.remove(solve.size() - 1);
					} else {
						return false;
					}
				} else {
					// ��һλ���Ƿ�����ֱ��false
					return false;
				}
			}
		}
		// ����������ļ����жϣ�Ϊ���򷵻�true������false
		if (solve == null || solve.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
