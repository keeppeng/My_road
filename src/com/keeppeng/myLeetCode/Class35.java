package com.keeppeng.myLeetCode;

/**
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 * 
 * ����Լ������������ظ�Ԫ�ء�
 * 
 * ʾ�� 1:
 * 
 * ����: [1,3,5,6], 5 ���: 2 ʾ�� 2:
 * 
 * ����: [1,3,5,6], 2 ���: 1 ʾ�� 3:
 * 
 * ����: [1,3,5,6], 7 ���: 4 ʾ�� 4:
 * 
 * ����: [1,3,5,6], 0 ���: 0
 * 
 * @author keeppeng
 * @date 2019��6��6�� ����2:50:09
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
	 * �Ƽ�ʹ�ö��ַ����� �����м��ֵ��������ڴ�ֵ��ֱ�ӷ���index��������ڣ���
	 */
}
