package chap4;
import java.util.Scanner;
/*
 * �� ���� ���ڸ� �Է¹޾� �ҹ����� ���� �빮�ڷ� ����
 * ��, �ҹ��ڰ� �ƴ� ���� "�ҹ��� �ƴ�"�̶�� ���
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();	//���ڿ��� ����
		char ch = str.charAt(0);
		char c2 = (char)(ch - 32);	
		System.out.println(('a'<=ch && ch<='z')?c2:"�ҹ��� �ƴ�");
		//String result = ('a'<=ch && ch<='z')?""+(char)(ch-32):"�ҹ��� �ƴ�";
		//System.out.println(result);
	}

}
