package chap4;
import java.util.Scanner;
/*
 *  ȭ�鿡�� �ݾ��� �Է� �޾� 500, 100, 50, 10, 1���������� �ٲٱ�
 *  �ʿ��� ������ ������ ����ϱ�
 *  [���]
 *  �ݾ��� �Է��ϼ���
 *  5641
 *  
 *  500�� : 11��
 *  100�� : 1��
 *  50�� : 0��
 *  10�� : 4��
 *  1�� : 1��
 */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		System.out.println("\n500�� : " + count/500 + "��");
		System.out.println("100�� : " + (count%500)/100 + "��");
		System.out.println("50�� : " + ((count%500)%100)/50 + "��");
		System.out.println("10�� : " + (((count%500)%100)%50)/10 + "��");
		System.out.println("1�� : " +  count%10+ "��");

	}

}