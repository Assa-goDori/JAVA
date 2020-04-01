package chap5;
import java.util.Scanner;
/*
 * 화면에서 자연수를 입력받아 각각의 자리수의 합을 구하기.
 * [결과]
 * 자연수를 입력하세요
 * 123
 * 자리수 합 : 6
 * 
 * 자연수를 입력하세요
 * 541
 * 자리수 합: 10
 * 
 * 자연수를 입력하세요
 * 5411
 * 자리수 합 : 11
 */
public class Exam7 {
	public static void main(String[] args) {
		System.out.println("자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		
		while(num != 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("자연수의 합 : " + sum);
		
	}

}
