package chap6;
import java.util.Scanner;
/*
 * 10������ 2������ ��ȯ�Ͽ� ����ϱ�
 */
public class ArrayEx4 {

	public static void main(String[] args) {
		int[] arr = new int[32];
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int divnum = input, index = 0;
		while(divnum != 0) {
			arr[index++] = divnum%2;
			divnum /= 2;
		}
		
		System.out.print(input + "�� 2�� ���� : ");
		for(int i = index-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}
