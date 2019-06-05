package com.keeppeng.myLeetCode;

/**
 * ����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
 * 
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 * 
 * Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء� ʾ�� 1:
 * 
 * ���� nums = [3,2,2,3], val = 3,
 * 
 * ����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��
 * 
 * �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء� ʾ�� 2:
 * 
 * ���� nums = [0,1,2,2,3,0,4,2], val = 2,
 * 
 * ����Ӧ�÷����µĳ��� 5, ���� nums �е�ǰ���Ԫ��Ϊ 0, 1, 3, 0, 4��
 * 
 * ע�������Ԫ�ؿ�Ϊ����˳��
 * 
 * �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * 
 * @author keeppeng
 * @date 2019��6��5�� ����2:16:33
 */
public class Class27 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 4, 5 };
		int val = 4;
		System.out.println(removeElement(nums, val));
	}

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}
