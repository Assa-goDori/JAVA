package chap5;
import java.util.Scanner;
/*
 * if ���ǹ� ����
 * 
 * if(���ǽ�1) {
 *     ���� 1 <= ���ǽ�1�� ����� ���� ��� ���� �Ǵ� ����
 * } else {
 *     ���� 2 <= ���ǽ�1�� ����� ������ ��� ���� �Ǵ� ����
 * }
 * 
 * 
 * if(���ǽ�1) {
 *		���� 1 <= ���ǽ�1�� ����� ���� ��� ���� �Ǵ� ����
 * } else if(���ǽ�2) {
 * 		���� 2 <= ���ǽ�1�� ����� �����̰�, ���ǽ�2�� ����� ���� ��� ���� �Ǵ� ����
 * } else if(���ǽ�3) {
 * 		���� 3 <= ���ǽ�1�� ���ǽ�2�� ����� �����̰�, ���ǽ�3�� ����� ���� ��� ���� �Ǵ� ����
 * } else {
 * 		���� n <= ���ǽ�1, ���ǽ�2, ���ǽ�3�� ��� ������ ��� ���� �Ǵ� ����
 * }
 * 
 * if(���ǽ�) else ���� ���� if ���� ����. if ���� else�� �Ұ���.
 * ����Ǵ� ������ �ѹ����� ���� �߰�ȣ{} ���� ����.
 * if, else ���� ���ο� �ٽ� if ���� ��� ������. 
 */
public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score >= 60) {
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		} else {
			System.out.println("������ȸ��");
		}
		// 90�� �̻� A����, 80�� �̻� B���� ......
		if(score >= 90) {
			System.out.println("A����");
		} else if (score>=80) {
			System.out.println("B����");
		} else if (score >=70) {
			System.out.println("C����");
		} else if (score >=60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
	}		// ���� �޼��� ���� => ���α׷� ����

}
