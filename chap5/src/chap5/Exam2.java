package chap5;
import java.util.Scanner;
/*
 * Ű����κ��� �� ���� ���ڸ� �Է¹޾� �빮��, �ҹ���, ����, ��Ÿ ���������� ����ϱ�
 * 
 * [���]
 * �� ���� ���ڸ� �Է��ϼ���.
 * A
 * �빮��
 * 
 * [���]
 * �� ���� ���ڸ� �Է��ϼ���.
 * 8
 * ����
 * 
 * [���]
 * �� ���� ���ڸ� �Է��ϼ���.
 *  /
 *  ��Ÿ����
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String abc = scan.next();
		char ch = abc.charAt(0);
		
		if('a'<=ch && ch<='z')			System.out.println("�ҹ���");
		else if ('A'<=ch && ch<='Z')	System.out.println("�빮��");
		else if (ch>'0' && ch < '9')	System.out.println("����");
		else							System.out.println("��Ÿ����");
	}

}
