package chap4;
import java.util.Scanner;
/*
 * 10���� 99������ ���ڸ� �ڿ����� �Է¹޾� �Էµ� �� ���� ũ�ų� ���� 10�� ����� ���ϱ�
 * 10�� ������� �Էµ� ���� �� ���� ����ϱ�
 * [���]
 * 10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���
 * 24
 * 6
 * 
 */
public class Exam7 {
	public static void main(String[] args) {
		System.out.println("10���� 99������ ���ڸ� �ڿ����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int result = (a%10>0)?((a/10)+1)*10:a;
		System.out.println(result-a);
	}

}
