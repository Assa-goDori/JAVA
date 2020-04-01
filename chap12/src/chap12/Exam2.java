package chap12;
/*
 * count �޼��� �����ϱ�
 * int count("���ڿ� �ҽ�", "ã�� ���ڿ�") : ���ڿ� �ҽ����� ã�� ���ڿ��� ������ ����
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "12"));	//2
		System.out.println(count("12345AB12AB345AB", "AB"));	//3
		System.out.println(count("12345", "6"));				//0
	}
	public static int count(String str1, String str2) {
		int cnt = 0;
		int index = 0;
		while(str1.indexOf(str2, 0) != -1) {
			int a = str1.indexOf(str2, index);
			if(a>=0) { cnt++; }
			else { break; }
			index = a + str2.length();
		}
		return cnt;
	}
}