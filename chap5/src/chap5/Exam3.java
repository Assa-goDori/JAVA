package chap5;
import java.util.Scanner;
/*
 * ���� ���ϱ�
 * 	������ 4�� ����̰�, 100�� ����� ���� ���, ��, 400�� ����� ����
 * 
 * 	�� �ܴ� ���. �⵵�� �Է¹޾Ƽ� ���� ��� ���� ����ϱ�.
 * 
 * [���]
 * ������ �Է��ϼ���
 * 2020
 * ����
 * 
 * ������ �Է��ϼ���
 * 
 * 2100
 * ���
 * 
 */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) 	System.out.println("����");
				else 				System.out.println("���");
			} else 					System.out.println("����");
		} else 						System.out.println("���");
	}

}