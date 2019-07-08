package com.keeppeng.myLeetCode;

import java.util.Arrays;

/**
 * 
 * @author keeppeng
 * @date 2019年6月20日 上午11:37:45
 * 
 *       给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 
 *       最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 
 *       你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 *       示例 1:
 * 
 *       输入: [1,2,3] 输出: [1,2,4] 解释: 输入数组表示数字 123。 示例 2:
 * 
 *       输入: [4,3,2,1] 输出: [4,3,2,2] 解释: 输入数组表示数字 4321。
 */
public class Class66 {

	public static void main(String[] args) {
		int[] input = { 9, 9 };
		int[] plusOne = plusOne(input);
		for (int i = 0; i < plusOne.length; i++) {
			System.out.print(plusOne[i]);
			System.out.print(",");
		}
	}

	public static int[] plusOne(int[] digits) {
		// 如果最后一位不是9，直接加1即可
		// if (digits[digits.length - 1] < 9) {
		// digits[digits.length - 1] = digits[digits.length - 1] + 1;
		// return digits;
		// } else {
		//
		// // 先将数组转换成数然后+1
		// String stringStart = "";
		// for (int i = 0; i < digits.length; i++) {
		// stringStart = stringStart + digits[i];
		// }
		// Integer valueOf = Integer.valueOf(stringStart);
		// valueOf++;
		//
		// String stringEnd = valueOf + "";
		// int[] res = new int[stringEnd.length()];
		// for (int i = 0; i < stringEnd.length(); i++) {
		// res[i] = Integer.parseInt(stringEnd.substring(i, i + 1));
		// }

		// 思路：从左往右遍历，如果小于9，直接+1；break否则变为0继续遍历
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				break;
			} else {
				digits[i] = 0;
				if (i == 0) {
					// 表示这是第一位，应当扩展一位
					int[] newints = { 1 };
					// 这里使用的是数组的扩容和复制,也可以扩容+1之后直接定义第一位为1，后面的默认值为0
					newints = Arrays.copyOf(newints, 1 + digits.length);
					System.arraycopy(digits, 0, newints, 1, digits.length);
					digits = newints;
				}
			}
		}
		return digits;
	}

}
