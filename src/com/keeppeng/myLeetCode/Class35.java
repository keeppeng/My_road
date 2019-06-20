package com.keeppeng.myLeetCode;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 
 * 你可以假设数组中无重复元素。
 * 
 * 示例 1:
 * 
 * 输入: [1,3,5,6], 5 输出: 2 示例 2:
 * 
 * 输入: [1,3,5,6], 2 输出: 1 示例 3:
 * 
 * 输入: [1,3,5,6], 7 输出: 4 示例 4:
 * 
 * 输入: [1,3,5,6], 0 输出: 0
 * 
 * @author keeppeng
 * @date 2019年6月6日 下午2:50:09
 */
public class Class35 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6, 9, 12 };
		int target = 20;
		System.out.println(checkIndex(nums, target));
	}

	public static int checkIndex(int[] arg1, int arg2) {

		if (arg2 <= arg1[0]) {
			return 0;
		} else if (arg2 == arg1[arg1.length - 1]) {
			return arg1.length - 1;
		} else if (arg2 > arg1[arg1.length - 1]) {
			return arg1.length;
		} else {
			for (int i = 1; i < arg1.length; i++) {
				if (arg1[i] >= arg2 && arg1[i - 1] < arg2) {
					return i;
				}
			}
		}

		return -1;
	}
	/**
	 * 推荐使用二分法查找 ，找中间的值，如果等于此值，直接返回index，如果大于，则
	 */
}
