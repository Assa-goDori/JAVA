package chap6;
import java.util.Scanner;
/*
 * 10진수를 16진수로 변환하기
 */
public class Exam2 {
	public static void main(String[] args) {
		char[] data = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		char[] arr = new char[32];		
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num, index=0;
		while(divnum != 0) {
			arr[index++] = data[divnum%16];
			divnum/=16;
		}
		System.out.print(num + "의 16진수 : ");
		for(int i = index-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}