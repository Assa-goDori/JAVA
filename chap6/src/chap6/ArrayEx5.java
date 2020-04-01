package chap6;
import java.util.Scanner;
/*
 *  10진수를 2, 8, 10, 16진수로 변환하기
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index = 0;
		
		int[] digit = {2, 8, 10, 16};
		char[] data = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		char[] arr = new char[32];
		
		for(int i : digit) {	// 개선된 for 구문. 첨자 사용불가, 
			divnum = num;
			index = 0; 
			while(divnum != 0) {
				arr[index++] = data[divnum%i];
				divnum /= i;
			}
			System.out.print(num + "의 " + i + "진수 : ");
			for(int k=index-1;k>=0;k--) { 
				System.out.print(arr[k]);
			}
			System.out.println();
		}
		System.out.println(num + "의 2진수 : " + Integer.toBinaryString(num));
		System.out.println(num + "의 8진수 : " + Integer.toOctalString(num));
		System.out.println(num + "의 16진수 : " + Integer.toHexString(num));
	}
}
