package chap6;
import java.util.Scanner;
/*
 * 10������ 16������ ��ȯ�ϱ�
 */
public class Exam2 {
	public static void main(String[] args) {
		char[] data = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		char[] arr = new char[32];		
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index=0;
		while(divnum != 0) {
			arr[index++] = data[divnum%16];
			divnum/=16;
		}
		System.out.print(num + "�� 16���� : ");
		for(int i = index-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}