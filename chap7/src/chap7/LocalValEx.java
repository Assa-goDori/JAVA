package chap7;
/*
 * �������� ����
 * 	���� ���� :
 * 		1. �޼��� ���ο� ����� ����
 * 		2. �Ű������� ����������.
 * 		3. �ݵ�� �ʱ�ȭ �ʿ�
 * 
 *  num, b, grade, score, args(�Ű� ������ ����������, �Ű� ������ ȣ���ϴ� ���� �ʱ�ȭ�� ��)
 */
public class LocalValEx {
	public static void main(String[] args) {
		int num;		// else  num = 200; �� ���� ��� num�� �ʱ�ȭ�� �ȵǴ� ��찡 ����Ƿ� ���� �߻�.
		boolean b = true;
		if(b) {
			num = 100;
		} else {
			num = 200;
		}
		System.out.println(num);
		String grade;				//default : grade = "F"�� ���°�� grade���� �ʱ�ȭ�� ���� �ʾ� ���� �߻�.
		int score = 80;
		switch(score/10) {
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F";
		}
		System.out.println("���� : " + grade);
	}
}
