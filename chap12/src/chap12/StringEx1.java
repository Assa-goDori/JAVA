package chap12;
/*
 *  String Ŭ����
 *  1. String Ŭ������ �����ϰ� ���� �����ڷ� ��ü ������ ����(new String()���ε� ��ü ���� ����)
 *  2. String Ŭ������ �����ϰ� + ������ ����� ���� : String = �⺻�� + String
 *  3. final Ŭ����(�ٸ� Ŭ�������� ��� ���� �� ����)
 *  4. ������ ���ڿ� : �ѹ� ������ ���� ���� �ʴ� ���ڿ�
 */
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if(s1 == s2) {
			System.out.println("s1 == s2 : ���� ��ü");
		} else {
			System.out.println("s1 != s2 : �ٸ� ��ü");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2) : ���� ���� ��ü");
		} else {
			System.out.println("!s1.equals(s2) : �ٸ� ���� ��ü");
		}
		
		if(s3 == s4) {
			System.out.println("s3 == s4 : ���� ��ü");
		} else {
			System.out.println("s3 != s4 : �ٸ� ��ü");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3.equals(s4) : ���� ���� ��ü");
		} else {
			System.out.println("!s3.equals(s4) : �ٸ� ���� ��ü");
		}
	}
}