package chap6;
import java.util.Scanner;
/*
 * 10진수를 2진수로 변환하여 출력하기
 */
public class ArrayEx4 {

	public static void main(String[] args) {
		int[] arr = new int[32];
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int divnum = input, index = 0;
		while(divnum != 0) {
			arr[index++] = divnum%2;
			divnum /= 2;
		}
		
		System.out.print(input + "의 2의 진수 : ");
		for(int i = index-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}
