package chap5;
import java.util.Scanner;
/*
 * ȭ�鿡 �ﰢ�� ���̸� �Է¹ް�, ���̿� �´� �ڷ� �ﰢ�� ����ϱ�
 * [���]
 * �ﰢ���� ���̸� �Է��ϼ���
 * 3
 * 	��
 * 	�ڡ�
 * 	�ڡڡ�
 */
public class Exam11 {
	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		
		for(int i=1;i<=high;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}

}