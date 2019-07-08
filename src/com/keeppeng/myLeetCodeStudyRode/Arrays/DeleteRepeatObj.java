package com.keeppeng.myLeetCodeStudyRode.Arrays;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 
 * @author keeppeng
 * @date 2019年6月28日 下午2:48:12
 */
public class DeleteRepeatObj {

	class Solution {
		public int removeDuplicates(int[] nums) {
			String s1 = "";
			String s2 = "";
			for (int i = 0; i < nums.length; i++) {
				s2 = Integer.toString(nums[i]);
				if (!s1.contains(s2)) {
					s1 = s1 + s2;
				}
			}
			return s1.length();
		}
	}
}
