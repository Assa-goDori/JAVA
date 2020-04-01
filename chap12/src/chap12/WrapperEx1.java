package chap12;
/*
 * Wrapper Ŭ���� : 8���� �⺻ �ڷ����� ��üȭ �ϱ� ���� Ŭ����
 *    �⺻�ڷ���             WrapperŬ����(���� Ŭ����)
 *    boolean      Boolean
 *    byte         Byte
 *    short        Short
 *    int          Integer
 *    long         Long
 *    char         Character
 *    float        Float
 *    double       Double
 *    
 *    �⺻������ �⺻���� �����ڷ����� �������� �Ұ� �ϴ�(�⺻�ڷ��� <=> �迭, Ŭ����, �������̽�)
 *    ��, ���������� �⺻�ڷ����� WrapperŬ���� ������ ����ȯ�� ����(jdk 5.0.)
 *    ������ -> �⺻�� : �����ڽ�
 *    �⺻�� -> ������ : ����ڽ�
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2 : " + (i1==i2));				// �ٸ���ü�̹Ƿ� false
		System.out.println("i1.equals(i2) : " + i1.equals(i2));	// ������̹Ƿ� true
		System.out.println("i1==100 : " + (i1==100));			// i1�� �⺻������ ����ȯ(��ڽ�)�Ǿ true
		int i3 = 100;
		System.out.println("i1==i3 : " + (i1==i3));				// Integer���� int���� �⺻���� ���� �񱳰� ���� true
		Integer i4 = 100;	//auto boxing
		System.out.println("i1==i4 : " + (i1==i4));				// 100���� ��ü������ �ٲ�(�ڽ�). �ٸ���ü�̹Ƿ� false
		//int���� ����
		System.out.println("int ���� �ִ� �� : " + Integer.MAX_VALUE);
		System.out.println("int ���� �ּ� �� : " + Integer.MIN_VALUE);
		System.out.println("int ���� bit�� : " + Integer.SIZE);
		//byte���� ����
		System.out.println("byte ���� �ִ� �� : " + Byte.MAX_VALUE);
		System.out.println("byte ���� �ּ� �� : " + Byte.MIN_VALUE);
		System.out.println("byte ���� bit�� : " + Byte.SIZE);
		//������ ���ڿ��� int�� ��ȯ
		int num = Integer.parseInt("123");
		System.out.println(num+100);
		//10������ 2����, 8����, 16������ ����
		System.out.println("10�� ������ : " + Integer.toBinaryString(10));
		System.out.println("10�� 8���� : " + Integer.toOctalString(10));
		System.out.println("10�� 16���� : " + Integer.toHexString(10));
	}
}