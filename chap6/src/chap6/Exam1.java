package chap6;
import java.util.Scanner;

/*
 * 10������ 8������ ����
 */
public class Exam1 {

	public static void main(String[] args) {
		int[] arr = new int[32];
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int divnum = input, index = 0;
		while(divnum != 0) {
			arr[index++] = divnum%8;
			divnum /= 8;
		}
		
		System.out.print(input + "�� 8�� ���� : ");
		for(int i = index-1; i>=0; i--) {
			System.out.print(arr[i]);
		}

	}

}
