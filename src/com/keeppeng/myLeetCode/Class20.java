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
 * @date 2019年6月5日 上午9:06:29
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
			// 如果为左半边的三个括号，可以直接加入集合
			if (array[i] == '(' | array[i] == '[' | array[i] == '{') {
				solve.add(array[i]);
			} else {
				if (i > 0 & solve.size() > 0) {
					// 如果不是第一位，就需要和前一位对比，成对出现就移除前一位,然后继续遍历
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
					// 第一位就是反括号直接false
					return false;
				}
			}
		}
		// 整完后对组件的集合判断，为空则返回true，否则false
		if (solve == null || solve.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
