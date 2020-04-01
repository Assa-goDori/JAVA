package chap5;
import java.util.Scanner;
/*
 * if 구문을 이용해서 숫자를 입력받아 양수, 음수, 영 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("양수");
		} else if(num<0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
	}

}
