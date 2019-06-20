package com.keeppeng.myLeetCode;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 
 * 如果不存在最后一个单词，请返回 0 。
 * 
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 
 * 示例:
 * 
 * 输入: "Hello World" 输出: 5
 * 
 * 
 * @author keeppeng
 * @date 2019年6月20日 上午10:46:46
 */
public class Class58 {

	public static void main(String[] args) {
		String str = " test ";
		System.out.println(checkoutString(str));
	}

	private static int checkoutString(String str) {
		int res = 0;
		boolean flag = true;
		boolean flag2 = true;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ' && flag == true) {
				// 当出现从后往前数不是空格的时候开始计数
				flag2 = false;
				res++;
			} else if (flag2 == true) {
				continue;
			} else {
				break;
			}
		}
		return res;
	}
}
