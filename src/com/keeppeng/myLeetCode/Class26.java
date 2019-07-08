package com.keeppeng.myLeetCode;

/**
 * ��26��ɾ�������е��ظ��� ��������
 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ
 * ��ֻ����һ�Σ������Ƴ���������³��ȡ�
 * 
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������� ��������
 * nums = [1,1,2],
 * 
 * ����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2��
 * 
 * �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء� ʾ�� 2:
 * 
 * ���� nums = [0,0,1,1,1,2,2,3,3,4],
 * 
 * ����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��
 * 
 * �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء� ˵��:
 * 
 * Ϊʲô������ֵ��������������Ĵ���������?
 * 
 * ��ע�⣬�����������ԡ����á���ʽ���ݵģ�����ζ���ں������޸�����������ڵ������ǿɼ��ġ�
 * 
 * ����������ڲ���������:
 * 
 * // nums ���ԡ����á���ʽ���ݵġ�Ҳ����˵������ʵ�����κο��� int len =
 * removeDuplicates(nums);
 * 
 * // �ں������޸�����������ڵ������ǿɼ��ġ� // ������ĺ������صĳ���,
 * �����ӡ�������иó��ȷ�Χ�ڵ�����Ԫ�ء� for (int i = 0; i < len; i++) {
 * print(nums[i]); }
 * 
 * @author keeppeng
 * @date 2019��6��5�� ����1:42:53
 */
public class Class26 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 2, 3, 5 };
		System.out.println(outputNums(nums));
		// System.out.println(outputNums2(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);// 123535
		}
	}

	/**
	 * ����û���ǵ���Ŀ�еĸ��ӶȺ��޸������Ҳ�ʹ�����������ռ�
	 * 
	 * @param nums
	 * @return
	 */
	public static int outputNums(int[] nums) {
		String reString = "";
		String temp = "";
		for (int i = 0; i < nums.length; i++) {
			temp = Integer.toString(nums[i]);
			if (!reString.contains(temp)) {
				reString += temp;
			}
		}
		return reString.length();
	}

	public static int outputNums2(int[] nums) {
		int len = nums.length;
		int slowP = 0;
		for (int fastP = 0; fastP < len; fastP++) {
			if (nums[fastP] != nums[slowP]) {
				slowP++;
				nums[slowP] = nums[fastP];
			}
		}
		return slowP + 1;
	}
}
