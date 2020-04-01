package chap6;
import java.util.Scanner;
/*
 *  10������ 2, 8, 10, 16������ ��ȯ�ϱ�
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		
		int[] digit = {2, 8, 10, 16};
		char[] data = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		char[] arr = new char[32];
		
		for(int i : digit) {	// ������ for ����. ÷�� ���Ұ�, 
			divnum = num;
			index = 0; 
			while(divnum != 0) {
				arr[index++] = data[divnum%i];
				divnum /= i;
			}
			System.out.print(num + "�� " + i + "���� : ");
			for(int k=index-1;k>=0;k--) { 
				System.out.print(arr[k]);
			}
			System.out.println();
		}
		System.out.println(num + "�� 2���� : " + Integer.toBinaryString(num));
		System.out.println(num + "�� 8���� : " + Integer.toOctalString(num));
		System.out.println(num + "�� 16���� : " + Integer.toHexString(num));
	}
}
