package chap11;
import java.util.Scanner;
/*
 * ȭ�鿡�� 1���� 10������ ���ڸ� �Է¹޾Ƽ� ���ڸ�ŭ *�� ���η� ����ϱ�
 * ��, 99���ڰ� �ԷµǸ� �Է� ����
 * �Է°��� ���ڰ� �ƴ� ���, "���ڸ� �Է��ϼ���" �޼��� ����ϰ�, �ٽ� �Է¹޵��� �����ϱ�
 * 
 * �߰� : �Էµ� ���ڰ� 1~10 ������ ���� �ƴѰ�� InputMissMatchExcetpion
 *      1���� 10������ ���ڸ� �Է��ϼ��� ���� ���
 *      ���� �ٽ� �Է� �ޱ�
 */ 

class NumberMissMatchException extends Exception {
	NumberMissMatchException(String msg) {
		super(msg); 
	}
}

public class Exam1 {
	public static void main(String[] args) {
		System.out.println("1���� 10������ ���ڸ� �Է��ϼ���.(���� : 99)");
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {			//try ���ο��� �ٱ��� ����� ������ ���� �Ұ�
				int input = scan.nextInt();
				if(input==99) { System.out.println("�Է��� �����մϴ�."); break; }
				if(input>10) { throw new NumberMissMatchException("1���� 10������ ���ڸ� �ٽ� �Է��ϼ���"); }
				System.out.print(input + " : ");
				for(int i = 0; i<input; i++) { System.out.print("*"); }
			} catch (NumberMissMatchException e) {
				System.out.println(e.getMessage());
				continue;
			} catch (Exception e) {
				System.out.println(scan.next() + "�� ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���");
				continue;
			}
			System.out.println();
		}
	}
}