package com.keeppeng.myLeetCode;

/**
 * 给定AB两个字符串，找出B字符串在A字符串中出现的位置，如果不存在则返回-1 如果B为""则返回0
 * 
 * @author keeppeng
 * @date 2019年6月6日 上午8:54:49
 */
public class Class28 {
	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "o";
		System.out.println(haystack.contains(needle));
		System.out.println(check(haystack, needle));
	}

	private static int check(String haystack, String needle) {
		if (needle == null || needle.equals("")) {
			return 0;
		} else if (needle.length() > haystack.length()) {
			// needle长度大于haystack
			return -1;
		} else if (!haystack.contains(needle)) {
			// 不包含则直接返回-1
			return -1;
		} else {
			// 到这里证明是包含的，拆分数组遍历
			char[] charArray = haystack.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				// 如果遍历到和目标string的第一个字符一样则使用字符串切割
				if (charArray[i] == needle.toCharArray()[0]) {
					if ((haystack.substring(i, i + needle.length()))
							.equals(needle)) {
						return i;
					}
				}
			}
			return -2;
		}
	}
}
