package chap4;
import java.util.Scanner;
/*
 * ���� ������(���� ������)
 * 	(���ǽ�) ? �� : ����
 * 
 * ���� ������ : ������ ���ǹ����� ������ �����ϴ�.
 */
public class OpEx10 {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		//���ǹ�
			String result;
			if(score>=60) {
				result = "�հ�";
			} else {
				result = "���հ�";
			}
		//String result = (score>=60)?"�հ�":"���հ�";
		System.out.println(score + "���� " + result + "�Դϴ�.");
		
		//60������ ���� ��������Դϴ�.
		result = (score>=70)?"�հ�":(score>=60)?"�������":"���հ�";
		System.out.println(score + "���� " + result + "�Դϴ�.");
		
	}

}
