package com.keeppeng.myLeetCode;

/**
 * ����AB�����ַ������ҳ�B�ַ�����A�ַ����г��ֵ�λ�ã�����������򷵻�-1 ���BΪ""�򷵻�0
 * 
 * @author keeppeng
 * @date 2019��6��6�� ����8:54:49
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
			// needle���ȴ���haystack
			return -1;
		} else if (!haystack.contains(needle)) {
			// ��������ֱ�ӷ���-1
			return -1;
		} else {
			// ������֤���ǰ����ģ�����������
			char[] charArray = haystack.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				// �����������Ŀ��string�ĵ�һ���ַ�һ����ʹ���ַ����и�
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
